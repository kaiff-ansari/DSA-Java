package ArrayPrograms.com;

import java.util.Arrays;

// copy one array to another array

public class Six {
    public static void main(String[] args) {

       int arr[] = {7,88,68,52};
       int num[] = new int[arr.length];

       for(int i = 0; i < arr.length; i++){
           num[i] = arr[i];
       }
      arr = num;
        System.out.println(Arrays.toString(num));





    }
}
