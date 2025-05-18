package leetcodePracticeQues;

import java.util.HashMap;
import java.util.Map;

public class Different_KElementSubarray {

    public static void main(String[] args) {

    }


    public int subarraysWithKDistinct(int[] nums, int k) {

        return helper(nums,k) - helper(nums,k-1);



    }

    public int helper(int[] nums,int k){

        int l = 0, r = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (r < nums.length){

            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            while (map.size() > k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);

                if (map.get(nums[l] )== 0){
                    map.remove(nums[l]);
                }
                l++;
            }

            count = count + (l-r+1);
            r++;
        }
        return count;
    }


}
