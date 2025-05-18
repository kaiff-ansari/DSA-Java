package SubsStringsQuestion;

public class largestSubArray {

    public static void main(String[] args){

        int[] arr = {10, 5, 2, 7, 1, -10};
         int k = 15;

        int result =  longest(arr,k);
        System.out.println(result);
    }

    public static int longest(int[] arr, int k) {


        int sum = 0;
        int max = 0;

        int l = 0, r = 0;

        while(r < arr.length) {

            sum = sum + arr[r];


            if (sum < k) {
                r++;
            } else if (sum == k) {

                max = Math.max(max, r - l + 1);
                r++;
            }

            else {
                while(sum > k){
                    sum = sum - arr[l];
                    l++;
                }

                if(sum == k){
                    max = Math.max(max,r-l+1);

                }
                r++;
            }

        }

        return max;
    }
}
