package leetcodePracticeQues;

import java.util.Arrays;

public class removeDuplicate {

    static int removeDuplicate(int[] arr){
        int unique = 1;

        for (int i = 1; i < arr.length; i++){

            if(arr[i] != arr[i-1]){
                arr[unique] = arr[i];
                unique++;

            }
        }
        return unique;

    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,2,3,3};

        System.out.println(removeDuplicate(arr));

    }
}
