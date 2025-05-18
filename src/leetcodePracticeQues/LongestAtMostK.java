package leetcodePracticeQues;

import java.util.HashMap;

public class LongestAtMostK {

    public static void main(String[] args) {

        System.out.println(solution("abccdef",2));

    }

    static int solution(String str, int k) {
        int l = 0, r = 0;
        int maxLen = 0;
        int n = str.length();

        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);

            if (map.size() > k) {
                map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                if (map.get(str.charAt(l)) == 0) {
                    map.remove(str.charAt(l));
                }
                l++;
            }

            if (map.size() <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }

        return maxLen;
    }
}
