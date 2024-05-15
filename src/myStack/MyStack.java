package myStack;

import java.util.ArrayList;

public class PractiseStack {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static int size;

    public static int pop() {
        int number = numbers.get(numbers.size() - 1);
        numbers.remove(numbers.size() - 1);
        return number;

    }
    public static void push(int number) {
        numbers.add(number);
        size++;
    }
}
