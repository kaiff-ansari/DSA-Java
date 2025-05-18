package ArraysStringsQuestion;

import java.util.Arrays;

public class ReverseInplace {

    public static void main(String[] args) {

        int[] arr = {5,4,3,1};

        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){

            swap(arr,start,end);
            start++;
            end--;


        }
    }

    static void swap(int[] arr, int first , int last){

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
