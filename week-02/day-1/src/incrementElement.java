public class incrementElement {

    public static void main(String[] args) {
        // write your code here

        /*
        - Create an array variable named `t`
        with the following content: `[1, 2, 3, 4, 5]`
        Increment the third element
        Print the third element
         */

        int[] t = {1, 2, 3, 4, 5};

        t[2] = t[2] + 1;

        System.out.println(t[2]);
    }
}
