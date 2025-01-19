package BinarySearch;

public class SquareOfRoot {
    public static void main(String[] args){
        int n = 8;
        System.out.println(checkSquareRoot(n));


    }

    static int checkSquareRoot(int x){ // method for check square

        int start = 0;
        int end = x/2;
        int ans = 0;

        if(x == 0 || x == 1){
            return x;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid * mid == x) {

                return mid;
            }
            else if(mid * mid < x){
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
