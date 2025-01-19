package Generics.comparing.com;

class HueHue extends Nothing {

    @Override
    public void music() {
        super.music();
    }

    @Override
    public void run() {
        super.run();
    }

    @Deprecated
    public int sum(int a, int b){
        return a +  b;

    }
}

//@FunctionalInterface
//interface myFunctionInterface {
//    void thisMethod();
//
//}

class Nothing {
    public void music(){
        System.out.println("music is on");
    }

    public void run(){
        System.out.println(" i am running");
    }
}
public class JavaAnnotations {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

      HueHue  h = new HueHue();

        h.run();
        h.sum(5,6);


    }
}
