package ArrayPrograms.com;

import java.util.Arrays;

public class MaximumArray {

    public static void main(String[] args) {

        int[] arr = {5,6,78,6,2,1};

        System.out.println(maxInRange(arr,3,5));




    }

    static int max(int[] arr){



        int max = Integer.MIN_VALUE;

        if (arr.length == 0){
            return -1;

        }

        for (int i = 1; i < arr.length; i++){

            if (arr[i] > max){

                max = arr[i];
            }
        }

        return max;
    }

    static int maxInRange(int[] arr, int start, int end){

        if (end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int max = arr[start];

        for (int i = start; i <= end; i++){

            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }




}
