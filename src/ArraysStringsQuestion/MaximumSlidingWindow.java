package ArraysStringsQuestion;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumSlidingWindow {

    public static void main(String[] args){

        // leetcode 239
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));


    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new ArrayDeque<>();
        int ans[] = new int[nums.length - k + 1];

        int l = 0;
        int r = 0;

        while (r < nums.length){

            if(q.size() == 0){
                q.add(nums[r]);
            }

            else {

                while(q.size() > 0 && q.peekLast() < nums[r]){
                    q.removeLast();
                }
                q.add(nums[r]);

            }

            if(r-l+1 < k){
                r++;
            }

            else if(r-l+1 == k){
                ans[l] = q.peek();

                if(nums[l] == q.peek()){
                    q.removeFirst();
                }
                l++;
                r++;
            }



        }
        return ans;




    }


}
