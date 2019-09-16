public class doubleItmes {

    public static void main(String[] args) {
        // write your code here

        /*
        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
         */


        int[] numList = {3, 4, 5, 6, 7};
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * 2;
            System.out.println(numList[i]);

        }


        // int[] numList = {3, 4, 5, 6, 7};
        // for (int i:numList) {
        //     System.out.println(i * 2);

        //  }


    }

        /*
        System.out.println(numList[0] * 2);
        System.out.println(numList[1] * 2);
        System.out.println(numList[2] * 2);
        System.out.println(numList[3] * 2);
        System.out.println(numList[4] * 2);
        */



        /*
        numList[0] = numList[0] * 2;
        numList[1] = numList[1] * 2;
        numList[2] = numList[2] * 2;
        numList[3] = numList[3] * 2;
        numList[4] = numList[4] * 2;

        System.out.print(numList[0] +" ");
        System.out.print(numList[1] +" ");
        System.out.print(numList[2] +" ");
        System.out.print(numList[3] +" ");
        System.out.print(numList[4] +" ");

         */
}
