package ArrayPrograms.com.staticExample;

import java.util.Arrays;

public class insertLast {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;

        if (n == arr.length) {

            arr = Arrays.copyOf(arr, n + 1);

        }


        arr[n] = 10;
        System.out.println(Arrays.toString(arr));

    }
}
