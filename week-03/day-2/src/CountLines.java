import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        /*
         Write a function that takes a filename as string,
         then returns the number of lines the file contains.
         It should return zero if it can't open the file, and
         should not raise any error.
         */
       // takeFileName("src/my-file.txt");
        System.out.println(takeFileName("src/ertt.txt"));
    }
    public static int takeFileName(String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> line = new ArrayList<>();
        try {
            line = Files.readAllLines(filePath);
        } catch (IOException e) {
          //  e.printStackTrace();   -->> kiírja a hibaüzenetet!!!
            return 0;
        }
        return line.size();
    }
}
