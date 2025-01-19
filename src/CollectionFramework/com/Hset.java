package CollectionFramework.com;

import java.util.HashSet;

public class Hset {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6,0.5f);
        hs.add(2);
        hs.add(6);
        hs.add(11);
        hs.add(6);
        System.out.println(hs);
    }
}
