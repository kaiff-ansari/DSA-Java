package PracticeRecursion;

public class Two {

    public static void main(String[] args) {
        // reverse the string
      char[] s = {'H','E','L','L','O'};
      reverseString(s);
        System.out.println(s);




    }



    public static void reverseString(char[] s) {

        helper(s,0,s.length-1);



    }

    public static void helper(char[] s, int left, int right){

        if(left >= right){
            return;
        }

        char temp = s[left];
        s[left] =s[right];
        s[right] = temp;

        helper(s,left+1,right-1);
    }
}
