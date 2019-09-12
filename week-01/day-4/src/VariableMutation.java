public class VariableMutation {

    public static void main(String[] args) {
	// write your code here

        int a = 3;
        System.out.println(a + 10);

        int b = 100;
        System.out.println(b - 7);

        int c = 44;
        System.out.println(c * 2);

        int d = 125;
        System.out.println(d / 5);

        int e = 8;
        System.out.println(e * e);

        int g1 = 350;
        int g2 = 200;

        boolean g2Bigger = true;
        boolean g2Smaller = false;

        System.out.println((g2 * 2) > g1);

        int h = 135798745;
        boolean divisibleby11 = true;
        boolean notDivisibleby11 = false;

        System.out.println((h % 11) == 0);

        int i1 = 10;
        int i2 = 3;

        boolean hihgerThani2Squared = true;
        boolean smallerThani2Cubed = true;

        System.out.println(i1 > (i2 * i2));
        System.out.println(i1 < (i2 * i2 * i2));



        System.out.println("-------");


        int j = 1521;

        System.out.println((j % 5) == 0 || (j % 3) == 0);

    }
}
