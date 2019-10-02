import java.util.Arrays;

public class Anagram {

    public static boolean anagramCheck(String firstWord, String secondWord) {

        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        char[] charArrayFromFirstWord = firstWord.toCharArray();
        char[] charArrayFromSecondWord = secondWord.toCharArray();

        Arrays.sort(charArrayFromFirstWord);
        Arrays.sort(charArrayFromSecondWord);

        return Arrays.equals(charArrayFromFirstWord, charArrayFromSecondWord);
    }
}
