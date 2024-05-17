package myStack;

import java.util.ArrayList;

public class MyStack {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static int size;

    public MyStack(int size) {
    }

    public static int pop() {
        int number = numbers.get(numbers.size() - 1);
        numbers.remove(numbers.size() - 1);
        return number;

    }
    public static void push(int number) {
        numbers.add(number);
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public static boolean isFull() {
        return size == numbers.size();
    }
}
