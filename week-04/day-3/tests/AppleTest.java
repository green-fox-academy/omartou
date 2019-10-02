import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    Apple apple = new Apple();

    @Test
    public void getApple() {
        String result = apple.getApple();
        assertEquals("apple", result);
    }
}