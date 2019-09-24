import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class WriteSingleLine {

    public static void main(String[] args) {

        /*
        Write a function that is able to manipulate a file
        By writing your name into it as a single line
        The file should be named "my-file.txt"
        In case the program is unable to write the file,
        It should print the following error message: "Unable to write file: my-file.txt"
         */
        manipulate("src/my-fie.txt");

    }
    public static void manipulate(String fileName) {

        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        try {
            lines.add("Omar Toure");
            Files.write(filePath, lines);
        } catch (IOException e) {
           // e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
