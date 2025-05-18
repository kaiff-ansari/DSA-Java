package leetcodePracticeQues;

public class CountNoNiceArrays {

    public static void main(String[] args) {

    }

    public int numberOfSubarrays(int[] nums, int k) {

        return helper(nums,k) - helper(nums,k-1);

    }

    public int helper(int[] nums, int k){


        int l = 0, r = 0;
        int sum = 0, count = 0;

        while (r < nums.length){

            sum+= nums[r]%2;

            while (sum > k){

                if (nums[l] % 2 == 1){
                    sum--;
                }
                l++;
            }

            count = count + (r-l+1);
            r++;
        }

        return count;
    }
}
