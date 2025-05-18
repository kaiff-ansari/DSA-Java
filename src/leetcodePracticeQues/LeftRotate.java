package leetcodePracticeQues;

import javax.xml.transform.sax.SAXSource;
import java.util.Arrays;

public class LeftRotate {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

       rotate(nums,k);
        System.out.println(Arrays.toString(nums));



    }

    public static void rotate(int[] nums, int k) {

       int n = nums.length;

        reverse(nums,0,n-k-1);

        reverse(nums,n-k,n-1);

        reverse(nums,0,n-1);

    }

    static void reverse(int[] arr, int start, int end){

        while(start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
