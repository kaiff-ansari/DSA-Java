package Multithreading.com;

class One extends Thread {

    public void run(){
        while (true){
            System.out.println("good morning");

//            try{
//                Thread.sleep(200);
//            }
//            catch (InterruptedException e){
//               e.printStackTrace();
//            }

        }




    }
}

class Two extends Thread {
    public void run(){
//        while(true){
//            System.out.println("good evening");
//            try{
//                Thread.sleep(200);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//        }



    }
}


public class PracticeOne {

    public static void main(String[] args) {
        One p1 = new One();
        Two p2 = new Two();
       p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
//        p1.start();
        p2.start();
        System.out.println(p2.getState()); // for checking the thread state like new runnable.
        System.out.println(Thread.currentThread().getState()); // for checking current thread state

    }
}
