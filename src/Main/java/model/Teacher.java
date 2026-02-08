package model;
import java.util.ArrayList;
import java.util.HashMap;

public class Teacher extends User{

    ArrayList<Subject>Subjects;
    HashMap<Subject,ArrayList<String>>Uploads;

    public Teacher(String userrole,String name, int ID, String Email){
    super(userrole,name,ID,Email);}

    // TeacherInformation can be accessed here
    public String Teacherinfo(){
        return"Userinfo:"+userrole+"User Name:"+name+"User id:"+ID+"email:"+Email;}

    //Teacher adding Subjects
    public void addsubject(Subject c){
        Subjects.add(c);
    }

    // Teacher uploadings with respective of subject
    public String Uploaditem(Subject s, ArrayList item){
        Uploads.put(s,item);
    return "Upload Successfull";}

    //Teachers all subjects
    public ArrayList getsubjects(){
    return Subjects;}

    // Teachers all uploads of all subjects
    public HashMap<Subject,ArrayList<String>> getalluploads(){
        return Uploads;}

    //Teachers all uploads of respective subjects
    public ArrayList getalluploads(Subject s){
        return Uploads.get(s);}









}
