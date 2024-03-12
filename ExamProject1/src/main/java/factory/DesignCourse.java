package factory;

public class DesignCourse extends Course{
    public DesignCourse(int studentNumber, String teacher){
        this.courseName = "Design Course";
        this.studentNumber = studentNumber;
        this.teacher = teacher;
        System.out.println("create " + courseName);
    }

}
