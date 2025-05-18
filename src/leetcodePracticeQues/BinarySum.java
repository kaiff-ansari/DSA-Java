package leetcodePracticeQues;

public class BinarySum {


    public static void main(String[] args) {

        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums,goal));

    }

    public static int numSubarraysWithSum(int[] nums, int goal) {

        int l = 0, r = 0;

        int countZero = 0, sum = 0, result = 0;

        if (goal < 0){
            return 0;
        }

        while (r < nums.length){

            sum+= (nums[r]%2);

            while (l < r && (nums[l] == 0 || sum > goal)){

                if (nums[l] == 0){
                    countZero++;
                }
                else {
                    countZero = 0;
                }

                if (nums[l] % 2 == 1){
                    sum-= nums[l];
                    l++;
                }

            }

            if (sum == goal){
                result+= 1 + countZero;

            }

            r++;
        }

        return result;


    }
}
