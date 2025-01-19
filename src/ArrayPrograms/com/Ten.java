package ArrayPrograms.com;

import java.util.Arrays;

public class Ten {

    // Array rotation frm index 2.

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;
        int k = 0;
        int[] temp = new int[n];

        for(int i = d; i < n; i++){
            temp[k] = arr[i];
            k++;
        }

       for(int i = 0; i < d; i++){
           temp[k] = arr[i];
           k++;
       }

       for(int i = 0; i < n; i++){
           arr[i] = temp[i];
       }

        System.out.println(Arrays.toString(arr));

    }



}