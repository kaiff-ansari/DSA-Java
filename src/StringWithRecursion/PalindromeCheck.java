package StringWithRecursion;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("madam"));

    }

    static boolean checkPalindrome(String name){

        int start = 0;
        int end = name.length()-1;

        while (start <= end){

            if(name.charAt(start) != name.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
