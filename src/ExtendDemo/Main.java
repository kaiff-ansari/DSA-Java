package ExtendDemo;

public class Main implements B{

    @Override
    public void fun(){
        System.out.println("A is doing cool stuff");
    }

    @Override
    public void greet() {
        System.out.println("good evening");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet();
    }
}
