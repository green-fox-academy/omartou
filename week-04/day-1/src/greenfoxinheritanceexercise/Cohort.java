package greenfoxinheritanceexercise;


import java.util.ArrayList;
import java.util.List;

public class Cohort {

    List<Student> students;
    List<Mentor> mentors;

    String name;

    public Cohort(String name) {
        this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
    }
    public void addStudent(Student student) {

    }
    public void addMentor(Mentor mentor) {

    }
    public void info() {
        System.out.println( "The " + name + "cohort has" + students.size() + "students and " + mentors.size() + "mentors.");
    }
}
