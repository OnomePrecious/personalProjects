package ArrayExercises;

import java.util.Arrays;

public class OddElement {
    public static int countOddNumbers(int... numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                count++;
            }


        }


        return count;
    }

    public static int countEvenNumbers(int... numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                count++;
            }


        }


        return count;
    }



    public static void main(String[] args) {
        int [] numbers = {4, 5, 6, 7, 8};
        System.out.println("The number of odd numbers is:" + countOddNumbers(numbers));
        System.out.println("The number of even numbers is:" + countEvenNumbers(numbers));
    }
}

