public class SecondsInADay {


    public static void main(String[] args) {
        // write your code here


        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int dayHours = 24;

        System.out.println((dayHours * 3600) - currentHours * 3600 + currentMinutes * 60 + 24);

    }
}

