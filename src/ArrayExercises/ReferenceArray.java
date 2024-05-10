package ArrayExercises;

import java.util.Scanner;

public class ReferenceArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list1 = new int[5];
        int[] list2 = new int[5];

        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
            list1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            list2[i] = list1[i];
        }
        System.out.println("Numbers in list 2 are: "   );
        for (int i = 0; i < 5; i++) {
            System.out.println(list2[i]);
        }


    }
}
