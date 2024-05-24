package ArrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    public void test_isPalindrome() {
        int number = 121;
        boolean result = true;
        assertEquals(result, PalindromeNumber.isPalindrome(number));
    }

    @Test
    public void test_isNotAPalindrome() {
        int number = 123;
        boolean result = false;
        assertEquals(result, PalindromeNumber.isPalindrome(number));
    }
}