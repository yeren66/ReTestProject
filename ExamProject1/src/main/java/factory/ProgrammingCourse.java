package factory;

public class ProgrammingCourse extends Course{
    public ProgrammingCourse(int studentNumber, String teacher){
        this.courseName = "Programming Course";
        this.studentNumber = studentNumber;
        this.teacher = teacher;
        System.out.println("create " + courseName);
    }

}
