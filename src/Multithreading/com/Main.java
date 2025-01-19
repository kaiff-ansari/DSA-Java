package Multithreading.com;

class MyThread1 extends Thread {

    @Override
    public void run(){
        int i = 0;
        while (i < 1000){
            System.out.println(" thread 1 for chatting with her");
            System.out.println("i am sad ");
            i++;

        }


    }
}

class MyThread2 extends Thread {

    @Override
    public void run(){
        int i = 0;
        while (i < 1000){
            System.out.println("thread 2 for cooking something");
            System.out.println("i am happy ");
            i++;

        }


    }
}
public class Main {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
