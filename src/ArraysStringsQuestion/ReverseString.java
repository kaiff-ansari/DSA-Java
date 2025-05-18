package ArraysStringsQuestion;

public class ReverseString {

    public static void main(String[] args){

        String str = "kaif";

        System.out.println(reverse(str));



    }

    static String reverse(String str){

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while (start < end){

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;


        }

        return new String(arr);
    }
}
