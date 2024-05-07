package ArrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddElementTest {

    @Test
   public void countOddNumbers() {
        int [] numbers ={1,2,3,4,5,6,7,};
        int result = 4;

        assertEquals(result, OddElement.countEvenNumbers(numbers));
    }

    @Test
    public void countEvenNumbers() {
        int [] numbers = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int result = 5;
        assertEquals(result, OddElement.countEvenNumbers(numbers));
    }
}