package ArrayPrograms.com;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        int[] arr = new int[5];
//
//        System.out.println("enter the array ");
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//
//        for (int num : arr){
//            System.out.print(num +  " ");
//        }
//
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[5];

        for (int i = 0; i <str.length; i++){

            str[i] = sc.next();

        }


        System.out.println(Arrays.toString(str));

        str[1] = "kaif";
        System.out.println(Arrays.toString(str));

    }
}
