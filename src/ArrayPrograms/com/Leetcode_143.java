package ArrayPrograms.com;

import java.util.Arrays;

public class Leetcode_143 {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }




    public int maxScore(int[] nums, int k) {

        int lsum = 0 , rsum = 0 , maxsum = 0, n = nums.length;


        for(int i = 0; i < k; i++){
            lsum+= nums[i];

            maxsum = lsum;
        }

        int rightIndex = n-1;

        for (int i = k-1; i >= 0; i--){

            lsum-= nums[i];
            rsum += nums[rightIndex];
            rightIndex--;

            maxsum = Math.max(maxsum,lsum + rsum);
        }

        return maxsum;






    }



    static void reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;


        while (start < end){

            swap(arr,start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }


}
