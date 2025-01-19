package mypackage.com;



public class StaticBlock {

    static int a = 5;
    static int b;
    // will only run once ,  when the first object is crated when the class is loaded first time
    static {
        System.out.println("i am static block");
        b = a * 4;
    }
    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
        System.out.println(s.a + " " + s.b);

        StaticBlock.b +=  3;
        System.out.println(s.a + " " + s.b);

        StaticBlock s1 = new StaticBlock();
        System.out.println(s1.a + " " + s1.b);

    }
}
