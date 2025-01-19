package Oopspractice.com;

abstract class Random{
    abstract void greet();

    final int a = 10;


}

class PC extends Random {
    public void greet(){
        System.out.println("good evening");
    }

}
public class hii {

    public static void main(String[] args) {



       PC p = new PC();
       p.greet();
        System.out.println(p.a);

    }

}
