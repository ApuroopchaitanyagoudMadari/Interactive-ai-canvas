package model;

import java.util.ArrayList;

public class Subject {
    String Subjectname;
    int Subjectid;
    ArrayList<String> Items;

    public Subject(String Subjectname,int Subjectid){
        this.Subjectname =Subjectname;
        this.Subjectid = Subjectid;

    }
    public String getSubjectname(){
        return  Subjectname;}

    public int getSubjectid(){
        return  Subjectid;}

    public void setSubjectname(String Subjectname){
        this.Subjectname = Subjectname;}

    public void setSubjectid(int Subjectid ){
        this.Subjectid = Subjectid;}
    public void additem(String anySubject){
        Items.add(anySubject);
    }


}
