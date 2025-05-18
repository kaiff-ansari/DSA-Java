package Oopspractice.com;

public class MethodToStringEg {

    public static void main(String[] args) {

        Rand obj = new Rand("kaif");
        System.out.println(obj);

    }
}



class Rand {
    final int num = 15;
    String name;

    public Rand(String name){
        this.name = name;
    }
}