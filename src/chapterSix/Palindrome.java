package chapterSix;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(int number){
        int userInput = number;
        int reverse = 0;

         while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return userInput == reverse;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));

    }
}
