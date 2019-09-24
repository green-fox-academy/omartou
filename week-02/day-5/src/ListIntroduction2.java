import jdk.nashorn.api.tree.ArrayLiteralTree;

import java.util.ArrayList;

public class ListIntroduction2 {

    public static void main(String[] args) {

        /*
        Create a list ('List A') which contains the following values
        Apple, Avocado, Blueberries, Durian, Lychee
        Create a new list ('List B') with the values of List A
        Print out whether List A contains Durian or not
        Remove Durian from List B
        Add Kiwifruit to List A after the 4th element
        Compare the size of List A and List B
        Get the index of Avocado from List A
        Get the index of Durian from List B
        Add Passion Fruit and Pomelo to List B in a single statement
        Print out the 3rd element from List A
         */

       // String[] listA = {"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};



       // System.out.println(listA[0]);

       // String[] listB = {"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};



        ArrayList<String>listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        //System.out.println(listA.contains("Durian"));
        System.out.println(listA.contains("Avocado"));
        ArrayList<String>listB = new ArrayList<>();

        listB.add("Apple");
        listB.add("Avocado");
        listB.add("Blueberries");
        listB.add("Durian");
        listB.add("Lychee");

        listB.remove("Durian");

        if (listA.size() > listB.size()) {
            System.out.println("listA is bigger");
        } else {
            System.out.println("not bigger");
        }

    }
}
