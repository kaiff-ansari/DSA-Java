package properties.polymorphism;

public class Object {

    int num;

    public Object(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Object obj = new Object(5);
        System.out.println(obj);
    }
}
