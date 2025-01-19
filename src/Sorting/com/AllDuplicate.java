package Sorting.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicate {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        findDuplicates(arr);
        System.out.println(Arrays.toString(arr));



    }

    public static List<Integer> findDuplicates(int[] arr) {

        int i = 0;
        while (i < arr.length){

            int correctIndex = arr[i] -1;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        List <Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);

            }
        }

        return ans;



    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
