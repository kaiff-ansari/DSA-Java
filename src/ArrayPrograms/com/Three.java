package ArrayPrograms.com;

import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        System.out.println("enter the element of the array");

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();

        }

        for(int i = 0; i < size-1; i++){

            for(int j = 0; j < size-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }


        }

        System.out.println("sorted element of the array");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i]);

        }






    }
}
