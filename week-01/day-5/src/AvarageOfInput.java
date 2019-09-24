import java.util.Scanner;

public class AvarageOfInput {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);

        System.out.println("write 5 number");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += input.nextInt();
        }
        /*
        sum += input.nextInt();
       // System.out.println(sum);

        sum += input.nextInt();
       // System.out.println(sum);

        sum += input.nextInt();
       // System.out.println(sum);

        sum += input.nextInt();
       // System.out.println(sum);

        sum += input.nextInt();
       // System.out.println(sum);

         */

        System.out.println("sum");
        System.out.println(sum);

        System.out.println("avarage");
        System.out.println((sum) / 5);
    }
}

