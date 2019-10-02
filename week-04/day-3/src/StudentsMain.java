import java.util.ArrayList;

public class StudentsMain {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();


        Student student = new Student("David", 20, 5);
        Student student1 = new Student("Geza", 20, 5);

        students.add(student);
        students.add(student1);


        System.out.println(Student.numberOfStudents);
    }
}
