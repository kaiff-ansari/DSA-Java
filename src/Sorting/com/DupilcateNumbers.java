package Sorting.com;

import java.util.Arrays;

public class DupilcateNumbers {

    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        findDuplicate(nums);
        System.out.println(Arrays.toString(nums));


    }

    public static int findDuplicate(int[] nums){

        int i = 0;

        while(i < nums.length){

            if(nums[i] != i + 1){

                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }
                else {
                    return nums[i];
                }
            }

            else {
                i++;
            }
        }
        return -1;



    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
