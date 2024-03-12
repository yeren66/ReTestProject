package factory;

public class ProgrammingCourseFactory implements Factory{
    @Override
    public Course createCourse(int studentNumber, String teacher) {
        return new DesignCourse(studentNumber, teacher);
    }
}
