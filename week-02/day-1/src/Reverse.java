public class Reverse {

    public static void main(String[] args) {
        // write your code here

        /*
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`
         */

        int[] aj = {3, 4, 5, 6, 7};

        //a=3
        int a = aj[0];
        //3=7
        aj[0] = aj[4];
        //7=3
        aj[4] = a;
        //a=4
        a = aj[1];
        //4=6
        aj[1] = aj[3];
        //6=4
        aj[3] = a;

        for (int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }


    }
}
