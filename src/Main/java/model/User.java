package model;
/* lms_project/           <-- Root project folder
│
├─ model/              <-- All data classes
│    ├─ User.java
│    ├─ Student.java
│    ├─ Teacher.java
│    ├─ Course.java
│    └─ Subject.java
│
├─ service/            <-- Logic and AI integration
│    ├─ LoginService.java
│    ├─ AIService.java
│    └─ DataService.java
│
├─ ui/                 <-- JavaFX UI classes
│    ├─ LoginScreen.java
│    ├─ StudentDashboard.java
│    └─ TeacherDashboard.java
│
└─ Main.java           <-- Entry point
*/

public class User {
    protected String userrole;
    protected String name;
    protected int ID;
    protected String Email;
    protected String password;
    public User(String userrole,String name, int ID, String Email,String password){
        this.userrole =userrole;
        this.name = name;
        this.ID = ID;
        this.Email = Email;
        this.password = password;
    }
    //accessor methods
    public String getuserpassword(){

        return password;
    }
    public String getusername(){

        return name;
    }
    public String getuserEmail(){

        return Email;
    }
    public int getUserID (){

    return ID;}
    public String getUserrole (){

        return userrole;}


    //mutators methods
    public void setusername(String name){
        this.name = name;
    }
    public void setuserEmail(String Email){
        this.Email = Email;
    }
    public void setuserID(int ID) {
        this.ID = ID;
    }
    public void userrole(String userrole) {
        this.userrole = userrole;
    }
    public String userspecificinfo(){

    return "Userinfo:"+userrole+"User Name:"+name+"User id:"+ID+"email:"+Email;}

}
