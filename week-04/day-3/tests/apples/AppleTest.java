package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    void getApple() {
        Apple apple = new Apple("apple");
        assertEquals("apple", apple.getApple());
    }
}