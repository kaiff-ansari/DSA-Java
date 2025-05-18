package leetcodePracticeQues;

public class ConsequestiveOnes {

    public static void main(String[] args) {


    }

    public int longestOnes(int[] nums, int k) {

        int r = 0, l = 0;
        int maxLength = 0, zero = 0;


        while (r < nums.length){

            if (nums[r] == 0){

                zero++;


            }

            if(zero > k){

                if (nums[l] == 0){
                    zero--;

                }
                l++;


            }

            if (zero <= k){
                maxLength = Math.max(maxLength,r-l+1);

            }

            r++;

        }

        return maxLength;

    }
}
