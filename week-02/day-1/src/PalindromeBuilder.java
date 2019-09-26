import java.util.Scanner;
public class PalindromeBuilder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write someting");
        String word = scanner.nextLine();
        System.out.println(palindromeBuilder(word) + word);
    }

    public static String palindromeBuilder(String palWord) {

        for (int i = palWord.length(); i > 0; i--) {

        }
        return palWord;
    }
}
