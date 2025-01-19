package Searching.com;

import java.util.Arrays;

public class Two {

    // search character in the string
    public static void main(String[] args) {
        String name = "Kaif";
        char target = 'a';
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){

        if(str.length() == 0){
            return false;
        }

        // Converting into the character using for each loop.
       for(char ch : str.toCharArray()){
           if(ch == target){
               return true;
           }
       }
        return false;
    }
}
