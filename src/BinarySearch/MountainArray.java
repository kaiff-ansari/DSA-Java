package BinarySearch;


public class MountainArray {
    public static void main(String[] args){
        // find the peak element in mountain array
        int[] arr = {1,2,0,1};
        System.out.println(PeakIndexInMountainArray(arr));

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
}
