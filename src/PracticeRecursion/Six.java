package PracticeRecursion;

import java.util.Arrays;

public class Six {


    public static void main(String[] args) {
        // bubble Sort using recursion
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr, int r, int c){

        if(r == 0){
            return;

        }

        if(c < r){

            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubbleSort(arr,r,c+1);
        }
        else {
            bubbleSort(arr,r-1,0);
        }
    }
}
