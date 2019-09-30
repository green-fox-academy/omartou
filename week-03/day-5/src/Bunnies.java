public class Bunnies {

    public static void main(String[] args) {

        /*
        We have a number of bunnies and each bunny has two big floppy ears.
        We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
         */

        System.out.println(countEars(6));

    }
    public static int countEars(int numberOfBunnies) {
        if (numberOfBunnies == 0) {
            return 0;
        } else {
            return 2 + countEars(numberOfBunnies - 1);
        }
    }
}
