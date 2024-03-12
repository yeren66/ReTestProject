import factory.*;
import observer.*;
import observer.User;

public class Main {
    public static void main(String[] args) {
        Factory programmingFactory = new ProgrammingCourseFactory();
        Factory designFactory = new DesingCourseFactory();

        // 使用工厂模式创建课程
        Course programmingCourse = programmingFactory.createCourse(60, "LiMing");
        Course designCourse = designFactory.createCourse(30, "joseph");

        // 使用观察者模式通知用户
        Platform platform = new Platform();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        platform.attach(user1);
        platform.attach(user2);

        platform.addCourse(programmingCourse);
        platform.addCourse(designCourse);
    }
}
