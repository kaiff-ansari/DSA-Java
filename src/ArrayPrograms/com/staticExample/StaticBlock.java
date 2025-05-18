package ArrayPrograms.com.staticExample;

public class StaticBlock {

    static int a = 5;
    static int b;

    static {
        System.out.println("i am static block ");
        b = a * 5;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
