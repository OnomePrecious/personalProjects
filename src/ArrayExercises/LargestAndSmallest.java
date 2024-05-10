package ArrayExercises;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
            int largest = array[0];
            int smallest = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] > largest) {
                    largest = array[i];
                }
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }

            System.out.println("The largest element is number:" + largest +  ", The smallest element is number: " +  smallest);

        }

    }


