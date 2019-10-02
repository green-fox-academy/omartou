public class Student {

    String name;
    int age;
    int mark;
    static int numberOfStudents = 0;
    static double avarageOfMark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        numberOfStudents++;
    }
}
