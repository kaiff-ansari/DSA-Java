package Recursion.com;

import java.util.Arrays;

public class TrianglesSun {

    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
        printTriangle(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void printTriangle(int[] arr){

        if(arr.length == 1){
            return;
        }

        int[] temp = new int[arr.length-1];
        helper(arr,temp,0);
        printTriangle(temp);
        System.out.println(Arrays.toString(temp));
    }

    static void helper(int[] arr, int[] temp, int index){

        if(index == arr.length-1){
            return;
        }

        temp[index] = arr[index] + arr[index+1];
         helper(arr,temp,index+1);
    }

}
