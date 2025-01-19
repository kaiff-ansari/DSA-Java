package Multithreading.com;

class MyThr1 extends Thread {

    public MyThr1(String name){
        super(name);
    }

    public void run(){
        int i = 34;
        while (true){
            System.out.println("thank you " + getName());

        }

    }
}
public class Priority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("aakash");
        MyThr1 t2 = new MyThr1("altaf");
        MyThr1 t3 = new MyThr1("naved");
        MyThr1 t4 = new MyThr1("kaif");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
