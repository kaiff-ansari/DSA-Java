package Multithreading.com;

class A implements Runnable{
    private String name;

    public A(String name){
       this.name = name;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("thread " + name + " of i is : " + i);
        }
        System.out.println("exit from A thread" + name);
    }
}

class B implements Runnable{
    public void run(){
        for(int j = 0; j < 10; j++){
            System.out.println("the second thread j : " + j);
        }
        System.out.println("exit from B thread");

    }


}
public class PracticeTwo {

    public static void main(String[] args) {

        A p1 = new A("kaif");
        A p2 = new A("naved");
        A p3 = new A("altaf");

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        B k1 = new B();
        Thread t4 = new Thread(k1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());
//        System.out.println(t3.getName());


    }
}
