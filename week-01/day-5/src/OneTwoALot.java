import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);


        int number = 0;
        System.out.println("Write a number");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("not enough");
        }
        if (number == 1) {
            System.out.println("One");
        }
        if (number == 2) {
            System.out.println("Two");
        }
        if (number > 2) {
            System.out.println("A lot");
        }



        /*
        if (number <= 0) {

            System.out.println("not enough");
        }

        else
            */

    }
}
