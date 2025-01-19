package StackImplement;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElment {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        int[] ans = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length-1; i >= 0; i--){
            int element = nums2[i];

            if(stack.isEmpty()){
                stack.push(element);
                ans[i] = -1;
                continue;
            }

            if(stack.peek() > element){
                stack.push(element);
                ans[i] = stack.peek();
                continue;
            }

            while (stack.peek() <= element && !stack.isEmpty()){
                stack.pop();

            }

            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else {
                ans[i] = stack.peek();
                stack.push(element);
            }
        }

        return ans;




    }
}
