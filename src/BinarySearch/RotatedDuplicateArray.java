package BinarySearch;

public class RotatedDuplicateArray {

    public static void main(String[] args){


    }

    // all code will be same
    static int findPivotInDuplicate(int[] arr){
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
           // if element at middle, start, end are equal then just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicate
                // Note what if these elements at start and end where the pivot ?
                // check if start is pivot

                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // if end is pivot
                if(arr[end] < arr[end-1]){
                    return end -1;
                }
                end--;
            }

            // left side is sorted , so pivot should be in right

            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;

            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
