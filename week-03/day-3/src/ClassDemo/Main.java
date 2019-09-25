package ClassDemo;
//import ClassDemo.ZigZagStudents;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ZigZagStudents firstStudent = new ZigZagStudents("Geza");
        ZigZagStudents secondStudent = new ZigZagStudents("Joli");
        ZigZagStudents thirdStudent = new ZigZagStudents("Sanyi", 2, 120);

        String introduction = thirdStudent.introduce();
        System.out.println(introduction);
        thirdStudent.askQuestions();
        introduction = thirdStudent.introduce();
        System.out.println(introduction);

       // ZigZagStudents.numberOfDNAPairs;
    }
}
