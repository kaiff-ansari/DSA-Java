package ArrayPrograms.com;

import java.util.Arrays;

// merge two arrays

public class Seven {
    public static void main(String[] args) {
        int[] arr1 = {7,8,9};
        int[] arr2 = {10,12,15};
        int[] merge = new int[arr1.length + arr2.length];


        for(int i = 0; i < arr1.length; i++){
            merge[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            merge[i + arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(merge));


    }
}
