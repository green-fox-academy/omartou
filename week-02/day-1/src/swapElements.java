public class swapElements {

    public static void main(String[] args) {
        // write your code here
        /*
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`
         */

        String [] abc = {"first", "second", "third"};

        //q=0
        String q = abc [0];

        //0=third
        abc [0] = abc [2];

        //q=2
        abc [2] = q;

        for (int i = 0; i < abc.length ; i++) {
            System.out.println(abc[i]);

        }

    }
}
