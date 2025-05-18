package ArrayPrograms.com;

import java.util.Arrays;

public class PassingFunction {

    public static void main(String[] args) {

        int[] num = {4,5,6,8};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){

        arr[1] = 555;
    }
}
