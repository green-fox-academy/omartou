import java.util.Scanner;
public class PrintBigger {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.println("write 2 number");
        a = input.nextInt();
        b = input.nextInt();

        if (a < b) {
            System.out.println(b);
        }

        if (a > b) {
            System.out.println(a);
        }


    }
}
