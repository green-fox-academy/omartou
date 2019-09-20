import java.util.ArrayList;

public class ListIntroduction1 {

    public static void main(String[] args) {
        // write your code here

        ArrayList<String> names = new ArrayList<>();

        names.add("Feri");
        names.add("Zoli");
        names.add("Juli");
        // if (names.size() > 0) {
        //System.out.println(names.size());
        //}
        //System.out.println(names.get(2));

        //for (int i = 0; i < names.size() ; i++) {
        //    System.out.println(names.get(i));
        //}

        //for (int i = 0; i < names.size(); i++) {
        //    System.out.println(i + 1 + ". " + names.get(i));
        //    }

        names.remove(1);
        //for (int i = 0; i < names.size() ; i++) {
        //    System.out.println(names.get(i));
        //}
        //for (int i = names.size() - 1; i >= 0 ; i--) {
        //    System.out.println(names.get(i));
        //}
        names.clear();
    }
}
