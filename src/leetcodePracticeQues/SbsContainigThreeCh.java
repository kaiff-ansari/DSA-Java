package leetcodePracticeQues;

import java.util.Arrays;
import java.util.Map;

public class SbsContainigThreeCh {

    public static void main(String[] args) {

        System.out.println(numberOfSubstrings("abcabc"));

    }

    public static int numberOfSubstrings(String s) {

        int n = s.length();
        int count = 0;

        int[] lastseen = new int[3];

        Arrays.fill(lastseen,-1);
        for (int i = 0; i < n; i++){


            lastseen[s.charAt(i)-'a'] = i;

            if (lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != 1){

                count = count + (1 + Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2])));
            }

        }

        return count;

    }
}
