package ExercisesOnLoop;


public class EvenOddCount {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (int numbers = 1; numbers <= 10; numbers++) {
            if (numbers % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);

        }
    }
}

