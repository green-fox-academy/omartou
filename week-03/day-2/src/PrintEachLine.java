import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class PrintEachLine {

    public static void main(String[] args) {

        /*
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.nio.file.Files;

        public class PrintEachLine {
        public static void main(String[] args) {
        Write a program that opens a file called "my-file.txt", then prints
        each line from the file.
        If the program is unable to read the file (for example it does not exist),
        then it should print the following error message: "Unable to read file: my-file.txt"
         */

        try {
            Path filePath = Paths.get("src/my-file.txt");
            List<String> line = Files.readAllLines(filePath);
            for (int i = 0; i < line.size(); i++) {
                System.out.println(line.get(i));
            }
        } catch (Exception e) {
            System.out.println("unable to read file: my-file.txt");
        }
    }
}
