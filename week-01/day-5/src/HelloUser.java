import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);

        String userName;
        System.out.println("Name of the User");
        userName = input.next();

        System.out.println("Hello " + userName);




    }
}

