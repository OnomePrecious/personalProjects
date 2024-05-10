package ArrayExercises;


import java.util.List;
import java.util.Scanner;

    public class Largest{
        public static int largestElement(List<Integer> numbers) {
            int largest = numbers.get(0);

            for(int number: numbers) {
                if (number > largest) {
                    largest = number;
                }
            }
            return largest;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the numbers");
            int number = input.nextInt();
            List<Integer> numberList = List.of(number);
            int largestNumber = largestElement(numberList);
            System.out.println("The largest number from " + numberList  + "," + "is " +  largestNumber);

        }
    }

