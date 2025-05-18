package SubsStringsQuestion;

import java.util.HashMap;
import java.util.Map;

public class FruitsBasket_Leetcode {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(totalFruit(arr));

    }

    public static int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();

        int r = 0, l = 0;
        int ans = 0;

        while (r < fruits.length) {

            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);


                while (map.size() > 2) {

                    map.put(fruits[l], map.getOrDefault(fruits[l], 0) - 1);

                    if (map.get(fruits[l]) == 0) {
                        map.remove(fruits[l]);

                    }
                    l++;

                }
            ans = Math.max(ans, r - l + 1);
            r++;


        }

        return ans;

    }
}
