package chapterOne;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fail = 0;
        int pass = 0;
        int counter = 1;

        while (counter <= 10){
    System.out.print("Enter result, pass == 1, fail == 2: ");
    int result = scanner.nextInt();

    if (result == 1) {
        pass = pass + 1;

    }
    else {
        fail = fail + 1;
    }
    counter++;
}
    System.out.println("The number of passes is: " + pass);
    System.out.println("The number of failures is: " + fail);
    }
    }

