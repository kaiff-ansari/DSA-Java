package Sorting.com;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {-2,32,5,0,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }



    static void bubble(int[] arr){
        boolean swapped;

        for(int i = 0; i < arr.length; i++){ //  for number of passes
            swapped = false;
            // for each step max item will come at the last respective index
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }

            // if you did not swap for a particular value of i , it means array is sorted hence stop the program
            if(!swapped){ // !false = true
                break;
            }


        }
    }
}
