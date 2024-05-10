package ArrayExercises;

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        System.out.println(array[10]);
        array[5] = 35;
       int[] sum = new int[]{array[9] = array[6] + array[13]};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sum));
    }
}
