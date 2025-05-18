package SubsStringsQuestion;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueCharcK {

    public static void main(String[] args){

        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestkSubstr(s,k));
    }

    public static int longestkSubstr(String s, int k) {
       int l = 0, r = 0;
       int max = Integer.MIN_VALUE;

        Map<Character,Integer> map = new HashMap<>();
       while (r < s.length()){

           map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

           if(map.size() < k){

               r++;
           }

           else if(map.size() == k){
               max = Math.max(max,r-l+1);
               r++;
           }

           else if(map.size() > k){

               while (map.size() > k){

                   map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);

                   if(map.get(s.charAt(l)) == 0){
                       map.remove(s.charAt(l));
                   }
                   l++;

               }
               r++;
           }

       }

        if (map.size() < k) {
            return -1;
        } else {
            return max;
        }

    }
}
