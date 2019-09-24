import java.util.Scanner;
public class CountFrom {

    public static void main(String[] args) {
        // write your code here
        /*
        Create a program that asks for two numbers
        If the second number is not bigger than the first one it should print:
        "The second number should be bigger"

         If it is bigger it should count from the first number to the second by one
         example:

         first number: 3, second number: 6, should print:

         3
         4
         5
         */

        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Write two number");

        a = input.nextInt();
        b = input.nextInt();

        if (b < a) {
            System.out.println("The second number should be bigger");
        } else if (a < b) {
            for (int i = a; i < b ; i++) {
                System.out.println(i);
            }
        }
    }
}
