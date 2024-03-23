package chapterSix;

import java.util.Scanner;

public class Divisible {
    private static boolean isDivisible(int numbers){
        if(numbers % 5 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("The result of the divisibility is: " + isDivisible(number));
    }
}
