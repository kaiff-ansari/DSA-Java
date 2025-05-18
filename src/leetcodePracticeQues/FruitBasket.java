package leetcodePracticeQues;

import java.util.HashMap;
import java.util.Map;

public class FruitBasket {

    public static void main(String[] args) {


    }

    public static int totalElements(Integer[] arr) {

        int l = 0, r = 0;
        int maxLength = 0, n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();


        while (r < n){


            map.put(arr[r], map.getOrDefault(arr[r],0) + 1);


            if (map.size() > 2){

                map.put(arr[l],map.get(arr[l])-1);

                if (map.get(arr[l]) == 0){

                    map.remove(arr[l]);
                }
                l++;

            }

            if (map.size() <= 2){
                maxLength = Math.max(maxLength,r-l+1);
            }
            r++;


        }

        return maxLength;
    }
}
