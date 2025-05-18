package hashmapPc;

import java.util.HashMap;
import java.util.Map;

public class Hash {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();


        map.put("Kaif",1);
        map.put("altaf",2);
        map.put("naved",3);

        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(" key " + e.getKey() + " Value " + e.getValue());

        }


        System.out.println( map.getOrDefault("sumit",78));
    }
}
