import java.util.ArrayList;

public class TodoPrint {

    public static void main(String[] args) {
        // write your code here
        /*
         String todoText = " - Buy milk\n";
          Add "My todo:" to the beginning of the todoText
          Add " - Download games" to the end of the todoText
          Add " - Diablo" to the end of the todoText but with indention

          Expected outpt:

          My todo:
         - Buy milk
           - Download games
                 - Diablo

         */

        String todoText = " - Buy milk\n";
        String todoText1 = "My todo:\n";
        String todoText2 = " \t- Download games\n";
        String todoText3 = " \t\t- Diablo\n";

        StringBuilder list = new StringBuilder(todoText);
        list.insert(0, todoText1).append(todoText2).append(todoText3);

        System.out.println(list);










    }



}

