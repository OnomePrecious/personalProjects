package ArrayExercises;

public class AverageOfASeries {
    public static int calculateAverage(int... integers){
        int sum = 0;
        int average = 0;
        for(int i = 0; i < integers.length; i++){
            sum+= integers[i];
            average = sum / integers.length;


        }

        return average;
    }

    public static void main(String[] args) {
        int [] numbers = {5, 5, 5, 5};
        System.out.println(calculateAverage(numbers));

    }
}
