package Generics.comparing.com;

@FunctionalInterface
interface DemoAnno {
    void meth1(int a);
//    void meth2();
}

//class Check implements DemoAnno{
//    @Override
//    public void meth1() {
//        System.out.println("this is meth1");
//    }
//}

//class AnonyDemo implements DemoAnno{
//
//    @Override
//    public void meth1() {
//        System.out.println("this is method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("this is method 2");
//    }
//}
public class lambda {

    public static void main(String[] args) {

        // Anonymous class we cannot make an extras class for
        // implement interface we can directly make anonymous class
//        DemoAnno obj = new DemoAnno() {
//            @Override
//            public void meth1() {
//                System.out.println("this is method 1");
//
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("this is method 2");
//
//            }
//        };
//        obj.meth1();

        // Lambda Expression

//        DemoAnno obj = new Check();
//        obj.meth1();

    DemoAnno obj = (a)->{
        System.out.println("this is meth 1 from Lambda " + a);
    };
    obj.meth1(5);

    }
}
