package sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    sum.Sum sum = new sum.Sum();

    @Test
    public void sumfunction_With_Empty_List() {
        ArrayList<Integer> testNumbers = new ArrayList<>();
        int result = sum.sumFunction(testNumbers);
        assertEquals(0,result);
    }

    @Test
    public void sumfunction_With_One_Element() {
        ArrayList<Integer> testNumbers = new ArrayList<>(Arrays.asList(99));
        int result = sum.sumFunction(testNumbers);
        assertEquals(99, result);
    }

    @Test
    public void sumFunction_With_Multiple_Elements() {
        ArrayList<Integer> testNumbers = new ArrayList<>(Arrays.asList(10,20,30,40));
        int result = sum.sumFunction(testNumbers);
        assertEquals(100,result);
    }

    @Test
    public void sumFunction_With_Null() {
        ArrayList<Integer> testNumbers = null;
        Integer result = sum.sumFunction(testNumbers);
        assertEquals(null, result);
    }
}