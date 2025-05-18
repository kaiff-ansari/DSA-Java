package SubsStringsQuestion;

import java.util.HashSet;
import java.util.Set;

public class longestLenghth {


    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(longest(str));

    }

    static int longest(String str) {


        int left = 0, right = 0;
        int maxLength = 0;


        Set<Character> set = new HashSet<>();

        while (right < str.length()){

            char ch = str.charAt(right);

            if (!set.contains(ch)){

                set.add(ch);

                maxLength = Math.max(maxLength,right-left+1);
                right++;



            }

            else {
                set.remove(str.charAt(left));
                left++;
            }

        }

        return maxLength;
    }
}
