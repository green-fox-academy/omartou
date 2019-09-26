package teachersandstudents;

public class Main {

    public static void main(String[] args) {

        Students firstStudent = new Students();
        Teachers firstTeacher = new Teachers();

        firstStudent.question(firstTeacher);
        firstTeacher.teach(firstStudent);

        System.out.println();
    }
}
