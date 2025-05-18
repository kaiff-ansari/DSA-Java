package ArrayPrograms.com;

import java.util.Arrays;

public class insertAtFirst {

    public static void main(String[] args) {

        int[] arr = {5,4,6,7,9};
        int n = arr.length;

        if (n == arr.length){

            arr = Arrays.copyOf(arr,n+1);

        }



            for (int i = n; i > 0; i--){

                arr[i] = arr[i-1];
            }
            arr[0] = 50;

        System.out.println(Arrays.toString(arr));



        }






    }

