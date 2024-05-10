package Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
  public void test_maximum() {
        double number1 = 45.76;
        double number2 = 65.87;
        double number3 = 34.75;
        double result = number2;
        assertEquals(result, SquareRoot.maximum(number1, number2, number3));
    }
}