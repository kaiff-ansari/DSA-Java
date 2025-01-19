package Cloning.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kaif = new Human(21,"kaif ansari");
//        Human twin = new Human(kaif);

        Human twin =  (Human)kaif.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(kaif.arr));
        System.out.println(Arrays.toString(twin.arr));




    }
}
