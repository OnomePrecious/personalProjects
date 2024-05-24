package ArrayExercises;

public class PalindromeNumber {
    public static boolean isPalindrome(int number){
       int value = number;
        int palindrome = 0;

         while (number > 0) {
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number = number / 10;
        }
        return value == palindrome;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }
}
