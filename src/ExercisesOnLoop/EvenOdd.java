package ExercisesOnLoop;


public class EvenOdd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        for( int number = 1; number < 5; number++){
            if(number % 2 == 0) {
                even+= number;
            }else{
                odd+=number;
            }
            System.out.println("The sum of even number is:" +  even);
            System.out.println("The sum of odd number is:" +  odd);

        }

            }
        }
