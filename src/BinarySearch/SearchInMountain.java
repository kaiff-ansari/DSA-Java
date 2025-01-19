package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(Search(arr,target));

    }

    static int Search(int[] arr, int target){
        int peak = PeakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBs(arr, target, 0, peak);
        if(firstTry!= -1){
            return firstTry;
        }
        //  try to search second half
        return orderAgnosticBs(arr, target, peak+1, arr.length-1);


    }
    static int PeakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                // you are in dec part in array
                //this may be the ans but look at left
                end = mid;
            }
            else {
                // you are in asc order
                start = mid + 1; // because we know tha mid + 1 element greater than mid
            }
        }
        return start;  // or  return end as both are equal
        // int the end , start == end and pointing to the largest number because of the 2 check above
        // start and end always trying to find max element in the above 2 checks
        // hence, they are pointing to just one element, this is the max one because that is what the check says

    }

    static int orderAgnosticBs(int[] arr, int target, int start, int end){


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
}

