package ArraysStringsQuestion;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {1,5,50,6,10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        int second_largest = Integer.MIN_VALUE;
        int second_Smallest = Integer.MAX_VALUE;

        for(int num : arr){

            if(num > max){

                second_largest = max;
                max = num;
            }

            else if(num > second_largest && num < max){

                second_largest = num;
            }

            if (num < min){

                second_Smallest = min;
                min = num;
            }

            else if (num < second_Smallest && num > min){

                second_Smallest  = num;
            }



        }



        System.out.println("largest element in array " + max);
        System.out.println( "second largest element in array " + second_largest);
        System.out.println("small element in array " + min);

        System.out.println( "second smallest element in array " + second_Smallest);





    }
}
