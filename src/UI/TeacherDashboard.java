package ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Teacher;

public class TeacherDashboard extends Application {

    private Teacher teacher;

    public TeacherDashboard(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Teacher Dashboard - " + teacher.getUsername());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        Label subjectsLabel = new Label("Your Subjects:");
        ListView<String> subjectList = new ListView<>();
        subjectList.getItems().addAll(teacher.getSubjects());

        Label uploadsLabel = new Label("Uploads per Subject:");
        TextArea uploadArea = new TextArea();
        uploadArea.setText(teacher.getUploads().toString());
        uploadArea.setEditable(false);

        // Upload new item
        Label uploadLabel = new Label("Upload item to a subject:");
        TextField uploadField = new TextField();
        Button uploadButton = new Button("Upload");
        uploadButton.setOnAction(e -> {
            String subject = subjectList.getSelectionModel().getSelectedItem();
            if(subject != null && !uploadField.getText().isEmpty()) {
                teacher.uploadItem(subject, uploadField.getText());
                uploadArea.setText(teacher.getUploads().toString());
                uploadField.clear();
            }
        });

        layout.getChildren().addAll(subjectsLabel, subjectList, uploadsLabel, uploadArea,
                uploadLabel, uploadField, uploadButton);

        Scene scene = new Scene(layout, 400, 500);
        stage.setScene(scene);
        stage.show();
    }
}
