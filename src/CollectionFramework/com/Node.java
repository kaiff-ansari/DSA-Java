package CollectionFramework.com;

import java.util.LinkedList;

public class Node {

    // implementing linked list
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(11);
        l1.addLast(8);
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
    }
}
