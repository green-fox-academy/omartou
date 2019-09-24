import java.util.Scanner;

public class ConditionalVariableMutation {

    public static void main(String[] args) {
        // write your code here

        /*
        double a = 24;
        int out = 0;

        if ((a % 2 == 0)) {
            System.out.println();
        */

        /*
        int b = 13;
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number");
        b = input.nextInt();

        if ((10 < b) && (b < 20)) {
            System.out.println("sweet");
        } else if (b < 10) {
            System.out.println("less");
        } else if (b > 20) {
            System.out.println("more");
        }
         */

        /*
        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if ((credits >= 50) && !isBonus) {
            System.out.println(c-2);
        }  else if ((credits < 50) && !isBonus) {
            System.out.println(c-1);
        } else if (isBonus) {
            System.out.println(c);
        }
        */

        int d = 9;
        int time = 100;

        if ((d % 4 == 0) && (time < 200)) {
            System.out.println("check");
        } else if (time > 200) {
            System.out.println("time out");
        } else {
            System.out.println("run Forest run!");
        }
    }
}



