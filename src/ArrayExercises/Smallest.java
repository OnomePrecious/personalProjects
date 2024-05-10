package ArrayExercises;

import java.util.List;
import java.util.Scanner;

public class Smallest {
    public static int smallestNumber(List<Integer> numbers){
        int smallest = numbers.get(0);
        for(int number: numbers){
        if(number < smallest){
            smallest = number;
        }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number = scanner.nextInt();
        List<Integer> numberList = List.of(number);
        int smallest = smallestNumber(numberList);
        System.out.println(smallest);
    }
}
