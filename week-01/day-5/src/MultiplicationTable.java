import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);



        System.out.println("write a number");

        int i;
        int n;
        n = input.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));



        }

    }
}
