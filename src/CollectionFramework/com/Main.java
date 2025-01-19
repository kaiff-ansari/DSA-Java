package CollectionFramework.com;
import java.lang.reflect.Array;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(3);
        l2.add(5);
        l2.add(6);
        l2.add(9);
        l1.add(0,78);
        l1.add(0,25);

//        l1.addAll(l2);
//        for(int i = 0; i < l1.size(); i++){
//            System.out.println(l1.get(i));
//        }

        System.out.println(l1.contains(6));
    }
}
