package factory;

public class DesingCourseFactory implements Factory{
    @Override
    public Course createCourse(int studentNumber, String teacher) {
        return new DesignCourse(studentNumber, teacher);
    }
}
