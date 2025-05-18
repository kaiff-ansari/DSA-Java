package ArrayPrograms.com;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];


        for (int row = 0; row < arr.length; row++){

            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }


//        for (int row = 0; row < arr.length; row++){
//
//            for (int col = 0; col < arr[row].length; col++){
//
//                System.out.print(arr[row][col] + " ");
//            }
//
//            System.out.println();
//        }


//        for (int row = 0; row < arr.length; row++){
//
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] nums : arr){

            System.out.println(Arrays.toString(nums));
        }
    }
}
