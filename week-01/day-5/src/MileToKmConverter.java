import java.util.Scanner;
public class MileToKmConverter {

    public static void main(String[] args) {
        // write your code here

        double miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter miles");
        miles = in.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(kilometers + "km");



    }
}

