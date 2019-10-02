import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void anagramCheck_ExpectedTrue() {
        boolean result = anagram.anagramCheck("zoli", "oliz");
        assertEquals(true, result);
    }

    @Test
    public void anagramCheck_ExpectedFalse() {
        boolean result = anagram.anagramCheck("zoi", "oliz");
        assertEquals(false, result);
    }

    @Test
    public void anagramCheck_NotEqualLength() {
        boolean result = anagram.anagramCheck("zoi", "oliz");
        assertEquals(false, result);
    }

}