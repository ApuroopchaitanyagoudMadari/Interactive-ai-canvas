package main.ui;

import javafx.application.Application;


import service.DataService;
import service.LoginService;
import model.User;
import model.Student;
import model.Teacher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        LoginService loginService = new LoginService(dataService);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter Password:");
        String pass = sc.nextLine();
        System.out.println("Enter Role (Student/Teacher):");
        String role = sc.nextLine();

        User user = loginService.login(id, pass, role);
        if(user != null) {
            System.out.println("Login Successful! Welcome " + user.getUsername());
            if(user instanceof Student) {
                Student s = (Student) user;
                System.out.println("Courses: " + s.getCourses());
                System.out.println("Progress: " + s.getProgress());
            } else if(user instanceof Teacher) {
                Teacher t = (Teacher) user;
                System.out.println("Subjects: " + t.getSubjects());
                System.out.println("Uploads: " + t.getUploads());
            }
        } else {
            System.out.println("Login Failed!");
        }

        sc.close();
    }
}
