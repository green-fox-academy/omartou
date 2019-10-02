import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> takeString(String word) {
        HashMap<Character, Integer> myWord = new HashMap();

        char[] charArray = word.toCharArray();

        for (char result : charArray) {

            if (myWord.containsKey(result)) {
                myWord.put(result, myWord.get(result) + 1);
            } else {
                myWord.put(result, 1);
            }
        }
        return myWord;
    }
}
