package centelliInterview;


import java.util.Arrays;

public class sumofNumber {

    public static void main(String[] args) {
        int arr[] = {3, 1, 9, 7, 4};

        Arrays.sort(arr);
        int sum = 0;

        int m = 2;


        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the numbers is " + sum);
    }
}


