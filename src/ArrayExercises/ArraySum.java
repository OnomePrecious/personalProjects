package ArrayExercises;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Enter numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum of the numbers is " + sum);
    }


}
