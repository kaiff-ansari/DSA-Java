package ArraysStringsQuestion;

import java.util.Arrays;

public class MoveZeorsEnd {

    public static void main(String[] args){

//        int[] arr = {0,1,0,3,12,};
//
//        int i = 0;
//
//        for(int j = 0; j < arr.length; j++){
//
//            if (arr[j] != 0){
//
//                swap(arr,i,j);
//                i++;
//            }
//        }

        // another way

        int num[] = {0,1,0,3,12};

        int postIndex = 0;

        for(int i = 0; i < num.length; i++){

            if(num[i] != 0){

                num[postIndex] = num[i];
                postIndex++;
            }
        }

        while (postIndex < num.length){
            num[postIndex] = 0;
            postIndex++;
        }

        System.out.println(Arrays.toString(num));
    }

    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
