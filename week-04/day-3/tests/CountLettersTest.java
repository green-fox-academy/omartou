import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void takeString() {
        CountLetters countLetters = new CountLetters();
        HashMap<Character, Integer> result = countLetters.takeString("palacsinta");
        int example = result.get('p');
        assertEquals(1, example);
    }
}