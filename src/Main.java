import java.util.*;
public class Main{

    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,75};
        reverse(arr);
        System.out.println(Arrays.toString(arr));




    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start, end);
            start++;
            end--;
        }
    }
}