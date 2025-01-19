package BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int nums[] = {7,2,5,8,10};
        int m = 2;
        System.out.println(split(nums,2));

    }

    public static int split(int[] nums, int m){
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            end+= Math.max(start, nums[i]); // in the end of loop it will return maximum number in an array

        } // binary search

        while (start < end){
            // try for the middle as potential ans
            int mid = start + (end-start)/2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    // you can add this subarray, make new one
                    // say you add this num in to new subarray, then sum = num
                    sum = num;
                    pieces++;
                }


                else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }


        return end; // here start == end
    }
}
