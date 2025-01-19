package ArrayPrograms.com;

import java.util.Arrays;

public class Five {

    // remove duplicate element from the array

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int n = arr.length;
        int j = 0;
//        int[] temp = new int[arr.length];

        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];

            }
        }

        arr[j++] = arr[n-1];

        for(int i = 0; i < j; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
