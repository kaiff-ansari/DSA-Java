package ArrayPrograms.com;

import java.util.Arrays;

// remove all occurrences of an element in an array


public class Nine {
    public static void main(String[] args) {
        int[] arr = {3,9,2,3,5,6,8,3};
        int val = 3;
        int count = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }

       int[] newArr = Arrays.copyOf(arr,count);
        System.out.println(Arrays.toString(newArr));
    }
}