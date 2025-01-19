package ArrayPrograms.com;
import java.util.*;

public class Two {
    public static void main(String[] args) {

        // largest element  of an array

        int[] arr = {7,78,5,69,52,69,26};

        int max =  Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
              max = arr[i];
            }

        }
        System.out.println("the maximum element of the array is " + max);
    }
}
