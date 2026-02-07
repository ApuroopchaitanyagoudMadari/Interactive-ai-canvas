
import model.Student;
import model.Teacher;
import java.util.HashMap;

    public class DataService {
        public HashMap<String, Student> studentMap;
        public HashMap<String, Teacher> teacherMap;

        public DataService() {
            studentMap = new HashMap<>();
            teacherMap = new HashMap<>();
            initData();
        }

        private void initData() {
            // Sample students
            Student s1 = new Student("S001", "apuroop", "123");
            s1.addCourse("Math");
            s1.addCourse("Physics");
            studentMap.put(s1.getId(), s1);

            Student s2 = new Student("S002", "madari", "456");
            s2.addCourse("Chemistry");
            studentMap.put(s2.getId(), s2);

            // Sample teachers
            Teacher t1 = new Teacher("T001", "admin", "admin");
            t1.addSubject("Math");
            t1.addSubject("Physics");
            teacherMap.put(t1.getId(), t1);
        }
    }


