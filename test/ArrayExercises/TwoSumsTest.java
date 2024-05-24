package ArrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    @Test
   public void test_twoSums() {
        int[] numbers = {2, 7, 11, 15};
       int target = 9;
       int[] result = {0, 1};
        assertArrayEquals(result, TwoSums.twoSums(numbers, target));
    }
}