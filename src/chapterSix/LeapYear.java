package chapterSix;

import java.util.Scanner;

public class LeapYear {
private static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else{
            return false;
        }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }
}
