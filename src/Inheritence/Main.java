package Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4);
//        System.out.println(box.l + " " + box.w + " " + box.h);

//        BoxWeight b = new BoxWeight();
//        BoxWeight b4 = new BoxWeight(4,6,7,8);
//
//        System.out.println(b4.weight + " " + b4.h);

//        BoxPrice box = new BoxPrice(4,6,80);

        Box box = new BoxWeight();

        box.greeting(); // we can inherit the static method but cannot overrride
    }
}
