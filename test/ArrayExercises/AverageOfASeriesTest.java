package ArrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfASeriesTest {

    @Test
    void calculateAverage() {
        int[] numbers = {10, 20 , 30, 40};
        int average = 25;

        assertEquals(average,AverageOfASeries.calculateAverage(numbers));
    }


@Test
public void testCalculateWithDifferentArgument(){
        int[] values = {200, 10, 20, 30, 40, 60, 25};
        int result = 55;

        assertEquals(result,AverageOfASeries.calculateAverage(values));
    }

}