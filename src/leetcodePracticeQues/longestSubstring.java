package leetcodePracticeQues;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class longestSubstring {

    public static void main(String[] args) {



    }

    public int lengthOfLongestSubstring(String s) {


        Set<Character> set = new HashSet<>();

        int n = s.length();
        int left = 0, right = 0, maxLength = 0;



        while (right < n){

            char ch = s.charAt(right);

            if (!set.contains(ch)){

                set.add(ch);
                right++;

                maxLength =  Math.max(maxLength,set.size());
            }

            else {

                set.remove(s.charAt(left));
                left++;

            }


        }

        return maxLength;

    }
}
