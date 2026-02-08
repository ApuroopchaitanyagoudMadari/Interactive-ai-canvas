package model;

import java.util.ArrayList;
import java.util.HashMap;


public class Student extends User {
    ArrayList<Course> Courses;
    HashMap<Course,Integer>progress;
    public Student(String userrole,String name, int ID, String Email){
        super(userrole,name,ID,Email);

    }
    // Student information
    public String Studentinfo(){

        return"Userinfo:"+userrole+"User Name:"+name+"User id:"+ID+"email:"+Email;}

    // Student can add course
    public void addCourse(Course addnewcourse){
        Courses.add(addnewcourse);}

    // showing student enrolled courses
    public ArrayList enrolledcourses(){
    return Courses;}

    //student updating progress of course
    public void updateProgress(Course c,Integer courseperecent){
        progress.put(c,courseperecent);
    }




}
