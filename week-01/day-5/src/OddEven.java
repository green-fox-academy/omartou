import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);


        int number = 0;

        System.out.println("Type a number");
        number = input.nextInt();


        if (number % 2 == 0) {
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }


    }

}

