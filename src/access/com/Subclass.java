package access.com;

public class Subclass extends A {

    public Subclass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45,"kaif ansari");
        int n = obj.num;

        System.out.println(obj instanceof Object);

        // protected can be accessed only sub class same package.
    }

}
