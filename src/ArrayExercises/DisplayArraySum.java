package ArrayExercises;

import java.util.Scanner;

public class DisplayArraySum {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int total = 0;
        int [] array = new int [10];
        System.out.println("Enter ten numbers");
        for(int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
            total+= array[i];
        }
        System.out.println(total);
    }
}
