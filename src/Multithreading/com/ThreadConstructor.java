package Multithreading.com;

class MyThr extends Thread {

    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i = 34;
        System.out.println("thank you");
    }
}
public class ThreadConstructor {

    public static void main(String[] args) {

        MyThr t = new MyThr("Kaif");
        MyThr t2 = new MyThr("lalla");

        t.start();
        t2.start();
        System.out.println( "the name of thread is "+ t.getName());
        System.out.println("the is of thread is " + t.getId());
        System.out.println( "the name of thread is "+ t2.getName());
        System.out.println("the is of thread is " + t2.getId());




    }
}
