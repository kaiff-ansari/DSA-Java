package ArrayPrograms.com;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
       int[] arr1 = {7,8,9,1};
       int[] arr2 =  {7,8,9,1};

        if(Arrays.equals(arr1,arr2)){
            System.out.println("two arrays are equals");
        }
        else{
            System.out.println("not equal");
        }


    }
}
