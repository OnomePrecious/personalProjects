package chapterSix;

import java.util.Scanner;

public class DisplaySquareOfAsterisks {
    private static int squareOfAsterisks(int number){
        for(int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                System.out.println("* ");

            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(squareOfAsterisks(number));

    }
}
