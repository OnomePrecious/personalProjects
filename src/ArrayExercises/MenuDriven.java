package ArrayExercises;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of menu");
        int size = scanner.nextInt();

        int array[] = new int[size];

        int option;
        do {
            System.out.println(
                    "1. Accept element\n" +
                            "2. Display element\n" +
                            "3. Search the element\n" +
                            "4. Sort the array using bubble sort method\n" +
                            "5. Exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    acceptElement(array);
                    break;
                case 2:
                    displayElement(array);
                    break;
                case 3:
                    System.out.println("Enter the element to be searched");
                    int userInput = scanner.nextInt();
                    int search = searchElement(array, userInput);
                    if (search == -1) {
                        System.out.println("No element found");
                    } else {
                        System.out.println("Element found: " + search);
                    }
                    break;
                case 4:
                    System.out.println("The sorted array: ");
                    sortArray(array);
                    displayElement(array);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        } while (true);
    }


public static void acceptElement(int... array){
        for (int i = 0; i < array.length; i++){

        }

    }
    public static void displayElement(int... array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int searchElement(int[] array, int userInput) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userInput) {
                return i;
            }

        }
        return -1;
    }
public static void sortArray(int[] array){
            for(int i = 0; i < array.length-1; i++){
                for(int j = 0; j < array.length -i-1; j++){
                    if(array[j] < array[j]+1){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

