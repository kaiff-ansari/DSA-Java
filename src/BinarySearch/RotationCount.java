package BinarySearch;

public class RotationCount {
    // count the no of rotation in an array


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Count(arr));

    }

    static int Count(int[] arr){
        int pivot =  CountPivot(arr);
        return pivot + 1;
    }
    static int CountPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            // 4 case over here

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;

    }
}
