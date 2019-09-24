import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        /*
        Create a function that takes a number
        divides ten with it,
        and prints the result.
        It should print "fail" if the parameter is 0
        */

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Write a number");
        // int number = scanner.nextInt();
        printDivisonResult(0);


    }

    public static void printDivisonResult(int input) {

        try {
            //  input = 10 / input;
            System.out.println(10 / input);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("fail");
        }

    }
}
