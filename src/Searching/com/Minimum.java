package Searching.com;

public class Minimum {

    public static void main(String[] args) {
        int[] arr = {23,45,1,2,8,19,-1,14,28};
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];

            }
        }
        return ans;
    }

    static int max(int[] arr){
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];

            }
        }
        return ans;
    }
}
