package chapterOne;

import java.util.Arrays;

public class DemoSum {



    public static  int[] addition(int...numbers){
        int total = 0;
        for(int i = 1; i < numbers.length; i++){
            total+=i;
        }
        return new int[]{total};
    }
    public static void main(String[] args) {
        int[] array = {1, 2};
        System.out.println(Arrays.toString(addition(array)));
        
    }
}
