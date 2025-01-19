package BinarySearch;

public class OrderAgnosticBs {

    static int orderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){ // for search in the ascending order BS
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            else { // Search in descending order

                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arr = {16,14,4,3,-2,-3,-10};
        int target = -2;
        int ans = orderAgnosticBs(arr, target);
        System.out.println(ans);

    }
}
