package hashmapPc;

import java.util.HashMap;
import java.util.Map;

public class frequencyInbuilt {

    public static void main(String[] args){

        int[] arr = {3,7,1,5,6,7,3,3,1};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        for (Map.Entry<Integer, Integer> item : map.entrySet()){ // it works on sorted array

            System.out.println(item.getKey()  + " :" + item.getValue());
        }
    }
}
