package ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.User;
import model.Student;
import model.Teacher;
import service.DataService;
import service.LoginService;

public class LoginScreen extends Application {

    private DataService dataService = new DataService();
    private LoginService loginService = new LoginService(dataService);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("LMS Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Username
        Label userLabel = new Label("ID:");
        TextField userField = new TextField();
        grid.add(userLabel, 0, 0);
        grid.add(userField, 1, 0);

        // Password
        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();
        grid.add(passLabel, 0, 1);
        grid.add(passField, 1, 1);

        // Role selection
        Label roleLabel = new Label("Role:");
        ChoiceBox<String> roleChoice = new ChoiceBox<>();
        roleChoice.getItems().addAll("Student", "Teacher");
        roleChoice.setValue("Student");
        grid.add(roleLabel, 0, 2);
        grid.add(roleChoice, 1, 2);

        // Login Button
        Button loginButton = new Button("Login");
        grid.add(loginButton, 1, 3);

        loginButton.setOnAction(e -> {
            String id = userField.getText();
            String password = passField.getText();
            String role = roleChoice.getValue();

            User user = loginService.login(id, password, role);
            if(user != null) {
                if(user instanceof Student) {
                    StudentDashboard studentDashboard = new StudentDashboard((Student) user);
                    studentDashboard.start(new Stage());
                    primaryStage.close();
                } else if(user instanceof Teacher) {
                    TeacherDashboard teacherDashboard = new TeacherDashboard((Teacher) user);
                    teacherDashboard.start(new Stage());
                    primaryStage.close();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login Failed");
                alert.setHeaderText(null);
                alert.setContentText("Invalid ID, password, or role.");
                alert.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
