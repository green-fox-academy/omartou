import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatRevTest {

    MatRev matRev = new MatRev();


    @Test
    public void marciSumFunction_AllPositive() {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(3,13, 10));
        int result = matRev.marciSumFunction(test);
        assertEquals(26, result);
    }

    @Test
    public void marciSumFunction_EmptyList() {
        ArrayList<Integer> test = new ArrayList<>();
        int result = matRev.marciSumFunction(test);
        assertEquals(0, result);
    }
    @Test
    public void marciSumFunction_MinusZero() {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(2, -5, 0));
        int result = matRev.marciSumFunction(test);
        assertEquals(-3, result);
    }
}