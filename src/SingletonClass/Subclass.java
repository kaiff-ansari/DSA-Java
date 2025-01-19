package SingletonClass;

import access.com.A;

public class Subclass extends A {

    public Subclass(int num, String name){
        super(num,name);
    }



    public static void main(String[] args) {

//        A obj = new A(45,"kaif ansari");
//        int n = obj.num; // in protected different pacakages sublass cannnot acccessed.

    }

}

class SubSubclass extends Subclass{
    public SubSubclass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45,"kaif ansari");
        int n = obj.num;
    }
}

class Subclass2 extends A{
    public Subclass2(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(45,"kaif ansari");
        int n = obj.num;
    }


}