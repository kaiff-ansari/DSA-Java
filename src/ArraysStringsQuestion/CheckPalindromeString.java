package ArraysStringsQuestion;

public class CheckPalindromeString {

    public static void main(String[] args){

        String name = "madam";

        System.out.println(checkPalindrome(name));
    }

    static boolean checkPalindrome(String str){

        int start = 0;
        int end = str.length()-1;

        while (start < end){

            if (str.charAt(start) != str.charAt(end)){

                return false;
            }

            start++;
            end--;
        }

        return true;



    }
}
