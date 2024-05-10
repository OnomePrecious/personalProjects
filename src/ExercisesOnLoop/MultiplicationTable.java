package ExercisesOnLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        if(number < 0) {
            System.out.println("Enter a valid number");
        }else{
            for(int count = 1; count < 13; count++){
                System.out.println(number + " x " + count + " = " +  number * count);
            }
        }
    }
}
