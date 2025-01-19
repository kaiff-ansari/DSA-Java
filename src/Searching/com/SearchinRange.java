package Searching.com;

public class SearchinRange {

    static int LinearSearch(int[] arr, int target, int start,int end) {
        if (arr.length == 0) {
            return 0;
        }
        for (int i = start; i <= end; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Search element in range 1 to 4;
        int[] arr = {23,45,1,2,8,19,-1,14,28};
        int target = 1;
        System.out.println(LinearSearch(arr,target,1,4));
    }
}
