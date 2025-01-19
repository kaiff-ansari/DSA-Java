package Searching.com;

public class One {

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args){

        int[] nums = {23,45,1,2,8,19,-1,28};
        int target = 8;
        int ans = LinearSearch2(nums,target);
        System.out.println(ans);

    }

}