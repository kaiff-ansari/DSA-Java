package BinarySearch;

public class Main {

    // return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;

            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

}
