package Methods;

import java.util.Scanner;

public class SquareRoot {
    public static double maximum(double x, double y, double z){
        double maximumValue = x;
        if(y > maximumValue){
            maximumValue = y;
        }
        if (z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three floating point numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.println("The maximum number is:" + result);
    }
}
