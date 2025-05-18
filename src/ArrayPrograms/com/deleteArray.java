package ArrayPrograms.com;

import java.util.Arrays;

public class deleteArray {

    public static void main(String[] args) {

       int[] arr = {5,4,3,6};

       //int[] nums = deleteIndex(arr);

        int postoDelete = 2;
        System.out.println(Arrays.toString(deleteIndex(arr,postoDelete)));

//        for (int i = 0; i < n-1; i++){
//
//            arr[i] = arr[i+1];
//        }
//
//        arr = Arrays.copyOf(arr,n-1);
//
//        System.out.println(Arrays.toString(arr));
    }

    static int[] deleteLastArr(int[] arr){


        int n = arr.length;

        arr = Arrays.copyOf(arr,n-1);

        return  arr;

    }

    static int[] deleteIndex(int[] arr, int index){

        int n = arr.length;



        for (int i = index; i < n-1; i++ ){

            arr[i] = arr[i+1];
        }

        arr = Arrays.copyOf(arr,n-1);

        return arr;
    }


}
