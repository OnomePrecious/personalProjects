package ArrayExercises;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scanner.nextInt();

        int [] array = new int [size];

        System.out.println("Enter the numbers: ");
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int temp;

        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("The reversed array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
