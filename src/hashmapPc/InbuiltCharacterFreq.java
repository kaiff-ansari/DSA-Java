package hashmapPc;

import java.util.HashMap;
import java.util.Map;

public class InbuiltCharacterFreq {

    public static void main(String[] args) {

        String str = "abacaadbd";

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++){

            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        int maxfreq = 0;
        char maxchar = '\0';

        for (Map.Entry<Character,Integer> item : map.entrySet()){

            if (item.getValue() > maxfreq){

                maxfreq = item.getValue();
                maxchar = item.getKey();

            }


        }
        System.out.println(maxchar + " : " + maxfreq);
    }
}
