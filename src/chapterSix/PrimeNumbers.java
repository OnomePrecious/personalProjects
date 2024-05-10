package chapterSix;

import java.util.Scanner;

public class PrimeNumbers {
    private static int isPrimeNumber(int number){
        double v = 0.5 + 1;
        int result = (int) (number * v);

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The number is:"+ isPrimeNumber(number));
    }
}
