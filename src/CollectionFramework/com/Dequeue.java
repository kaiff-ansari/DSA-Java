package CollectionFramework.com;

import java.util.ArrayDeque;

public class Dequeue {

   // implementing Array Dequeue

    public static void main(String[] args) {

        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(69);
        d1.add(70);
        d1.add(71);
        d1.pollFirst();

        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());

    }
}
