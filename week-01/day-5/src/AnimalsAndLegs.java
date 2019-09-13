import java.util.Scanner;
public class AnimalsAndLegs {


    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);


        int chickensLegs;
        int pigsLegs;

        System.out.println("Number of chickens");
        chickensLegs = input.nextInt() * 2;

        System.out.println("chicken leg:" + chickensLegs);

        System.out.println("Number of pigs");
        pigsLegs = input.nextInt() * 4;

        System.out.println("pig leg:" + pigsLegs);

        System.out.println("number of the legs:");

        System.out.println(chickensLegs+pigsLegs);







        /*chickensLegs = input.nextInt();
        System.out.println("Chickens has:" );

        System.out.println("Number of pigs");
        pigsLegs = input.nextInt();




        System.out.println("Chickens and pigs has:" + (chickensLegs) * (pigsLegs));

         */






    }
}
