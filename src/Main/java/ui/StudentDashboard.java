package ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Student;
import service.AIService;

public class StudentDashboard extends Application {

    private Student student;
    private AIService aiService = new AIService();

    public StudentDashboard(Student student) {
        this.student = student;
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Student Dashboard - " + student.getUsername());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        Label coursesLabel = new Label("Your Courses:");
        ListView<String> courseList = new ListView<>();
        courseList.getItems().addAll(student.getCourses());

        Label progressLabel = new Label("Course Progress:");
        TextArea progressArea = new TextArea();
        progressArea.setText(student.getProgress().toString());
        progressArea.setEditable(false);

        // AI interaction
        Label aiLabel = new Label("Ask AI a question:");
        TextField aiField = new TextField();
        Button askAIButton = new Button("Ask AI");
        TextArea aiResponse = new TextArea();
        aiResponse.setEditable(false);

        askAIButton.setOnAction(e -> {
            String question = aiField.getText();
            aiResponse.setText(aiService.answerQuestion(question) + "\n" +
                    aiService.recommendNextCourse(student));
        });

        layout.getChildren().addAll(coursesLabel, courseList, progressLabel, progressArea,
                aiLabel, aiField, askAIButton, aiResponse);

        Scene scene = new Scene(layout, 400, 500);
        stage.setScene(scene);
        stage.show();
    }
}
