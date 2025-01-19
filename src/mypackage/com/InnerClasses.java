package mypackage.com;

public class InnerClasses {
     static class test{
        String name;

        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test t = new test("kaif");
        test t1 = new test("naved");
        System.out.println(t.name);
        System.out.println(t1.name);
    }
}
