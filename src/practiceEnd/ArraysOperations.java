package practiceEnd;

import java.util.Arrays;

public class ArraysOperations {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2};





//       arr = Arrays.copyOf(arr,arr.length+1);
//
//        for (int i = arr.length-1; i > 0; i--){
//
//            arr[i] = arr[i-1];
//
//        }
//
//        arr[0] = element;

        System.out.println(Arrays.toString(arr));
//         arr = insertPos(arr,10);
        arr = deleteIndex(arr,2);
        System.out.println(Arrays.toString(arr));



    }

    static int[] insertLast(int[] num){

        int n = num.length;
        num = Arrays.copyOf(num,n+1);

        num[n] = 1;
        return num;
    }

    static int[] insertPos(int[] arr, int element){

        int n = arr.length;

        int pos = 3;

        arr = Arrays.copyOf(arr,n+1);

        for(int i = n; i > pos; i--){

            arr[i] = arr[i-1];
        }

        arr[pos] = element;
        return arr;


    }

    static int[] deletfirst(int[] arr){


        int n = arr.length;


        for(int i = 1; i < n; i++){

            arr[i-1] = arr[i];
        }

        arr = Arrays.copyOf(arr,n-1);


        return arr;


    }

    static int[] deleteIndex(int[] arr, int pos){

        int n = arr.length;


        for (int i = pos; i < n-1; i++){

            arr[i] = arr[i+1];

        }

        arr = Arrays.copyOf(arr,n-1);
        return arr;
    }
}
