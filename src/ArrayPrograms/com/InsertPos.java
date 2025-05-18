package ArrayPrograms.com;

import java.util.Arrays;

public class InsertPos {


    public static void main(String[] args) {
        int[] arr = {5,1,2,6,9};

        int n = arr.length;
        int pos = 2;

        if (n == arr.length){

            arr = Arrays.copyOf(arr,n+1);
        }

        for (int i = n; i > pos; i--){

            arr[i] = arr[i-1];
        }

        arr[pos] = 50;

        System.out.println(Arrays.toString(arr));
    }
}
