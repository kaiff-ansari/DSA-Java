package ArraysStringsQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateKPlace {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int k = 2;

        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int first, int last){

        while (first < last){

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
