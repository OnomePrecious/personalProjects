package ArrayExercises;

public class DemoArraySum {
    public static void main(String[] args) {
        int[] score  = {34, 56, 23, 15, 17};
        int total = 0;
for(int counter = 1; counter < score.length; counter++){
    total+= score[counter];
}
        System.out.println(total);
    }
}