package Oopspractice.com;


class PolymorphismExample {
    static int Multiply(int a, int b){
        return a + b;
    }

    static double Multiple(double a , double b){
        return a + b;
    }

}

public class Six {
    //  Example Compile time polymorphism

    public static void main(String[] args) {
        System.out.println(PolymorphismExample.Multiple(15,6));
        System.out.println(PolymorphismExample.Multiple(5.26,89.25));

    }
}
