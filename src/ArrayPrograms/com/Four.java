package ArrayPrograms.com;

import java.util.Arrays;

public class Four {

    public static void main(String[] args) {
//        int[] arr = {7,8,-3,2,10,1};
//
//        Arrays.sort(arr);
//        for(int num : arr){
//            System.out.print(" " + num)

//        }

        // array sort in descending order

        int[] arr = {2, 6, 23, 98, 24, 35, 78};
        int size = 7;

        for(int i = 0; i < size-1; i++ ){

            for(int j = 0; j < size -1; j++){

                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        for(int item : arr){
            System.out.print(item + " ");
        }


    }
}
