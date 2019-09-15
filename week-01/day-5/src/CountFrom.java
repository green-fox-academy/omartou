import java.util.Scanner;
public class CountFrom {

    public static void main(String[] args) {
        // write your code here

       Scanner input = new Scanner(System.in);

       int a, b;

        System.out.println("Write two number");

        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            System.out.println("The second number should be bigger");
        }

        if (a < b) {



        for (int i = a; i <= b - 1 ; i++) {

            System.out.println(i);


        }
        }

        }

    }
