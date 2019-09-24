import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // write your code here

        //Scanner input = new Scanner(System.in);
        int number = 15;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + number * i);
        }
    }
}
