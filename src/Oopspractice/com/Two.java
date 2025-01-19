package Oopspractice.com;

interface Make {
    void Say();
    static int b = 10;


}

class A implements Make {
    @Override
    public void Say() {
        System.out.println("hello");
    }
}

public class Two {
    public static void main(String[] args) {
        A a = new A();
        a.Say();
        System.out.println(a.b);
    }
}
