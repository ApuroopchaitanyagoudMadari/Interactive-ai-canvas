package model;

import java.util.ArrayList;

public class Course {
    String coursename;
    int Courseid;
    ArrayList<String> items;
    public Course(String coursename,int Courseid){
        this.coursename =coursename;
        this.Courseid = Courseid;

    }
    public String getCoursename(){
        return  coursename;}

    public int getCourseid(){
        return  Courseid;}

    public void setCoursename(String coursename){
        this.coursename = coursename;}

    public void setCourseid(int Courseid ){
        this.Courseid = Courseid;}
    public void additem(String anycoursework){
        items.add(anycoursework);

    }

}
