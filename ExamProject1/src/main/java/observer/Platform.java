package observer;

import factory.Course;

import java.util.*;

public class Platform implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private List<Course> courseList = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String message) {
        for(Observer o: observers){
            o.update(message);
        }
    }

    public void addCourse(Course course) {
        this.courseList.add(course);
        notifyUpdate("New Course Added, " + course.courseInfo());
    }
}
