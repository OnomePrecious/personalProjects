package ExercisesOnLoop;

import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int result = 1;
        System.out.println("Enter two numbers: ");
         number1 = scanner.nextInt();
         number2 = scanner.nextInt();
          for(int i = 1; i <= number2; i++) {

            result*=number1;
        }
        System.out.println(result);

    }
}
