package Sorting.com;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {4,0,2,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {

        int i = 0;

        while (i < nums.length){

            int correct = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);

            }
            else {
                i++;
            }
        }

        // search for the first missing number
        for(int index = 0; index < nums.length; index++){

            if(nums[index] != index){
                return index;
            }
        }

        // case 2
        return nums.length;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
