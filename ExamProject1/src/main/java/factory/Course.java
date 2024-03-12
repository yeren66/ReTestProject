package factory;

public class Course {
    int studentNumber;
    String teacher;
    String courseName;

    public String courseInfo() {
        return "course name: " + courseName + "; teacher: " + teacher + "student number: " + studentNumber;
    }
}
