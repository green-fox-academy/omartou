import javax.swing.*;
import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);


        int girls, boys;

        System.out.println("Girls");
        girls = input.nextInt();

        System.out.println("Boys");
        boys = input.nextInt();

        if ((girls == boys) && ((boys + girls) >= 20)) {
            System.out.println("The party is excellent!");
        } else if ((girls != boys) && ((girls + boys) >= 20)) {
            System.out.println("Quite cool party!");
        } else if ((girls + boys) < 20) {
            System.out.println("Avarage party");
        } else if (girls < 1) {
            System.out.println("Sausage part");


        }


    }


}
