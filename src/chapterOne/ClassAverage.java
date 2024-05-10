package chapterOne;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        int grade = 0;

        while (grade != -1) {
            total +=grade;
            counter++;

            System.out.print("Enter grade or -1 to end: ");
            grade = scanner.nextInt();
        }

        if (counter != 0) {
            double average = (double) total / counter;

            System.out.printf("Total of the grades is %s%n", total);
            System.out.printf("Average of the grades is %.2f%n",  average);
        } else {
            System.out.println("No grades were entered");
        }
    }
}

