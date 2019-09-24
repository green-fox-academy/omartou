import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {

        /*
         Write a function that copies the contents of a file into another
         It should take the filenames as parameters
         It should return a boolean that shows if the copy was successful
         */

        copyFunction("src/my-file.txt", "src/my-secondfile.txt");


    }
    public static boolean copyFunction(String fileFrom, String fileTo) {
        Path filePath = Paths.get(fileFrom);
        Path filePath2 = Paths.get(fileTo);
        try {
            List<String> list = Files.readAllLines(filePath);
            Files.write(filePath2, list);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
}
