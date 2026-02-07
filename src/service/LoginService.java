package service;

import model.Student;
import model.Teacher;
import model.User;

public class LoginService {
    private DataService dataService;

    public LoginService(DataService dataService) {
        this.dataService = dataService;
    }

    public User login(String id, String password, String role) {
        if(role.equalsIgnoreCase("Student")) {
            Student s = dataService.studentMap.get(id);
            if(s != null && s.getPassword().equals(password)) {
                return s;
            }
        } else if(role.equalsIgnoreCase("Teacher")) {
            Teacher t = dataService.teacherMap.get(id);
            if(t != null && t.getPassword().equals(password)) {
                return t;
            }
        }
        return null; // login failed
    }
}
