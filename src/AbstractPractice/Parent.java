package AbstractPractice;

public abstract class Parent {

    int age;

    final int value;

    static void hello(){
        System.out.println("hey");
    }

    void greet(){
        System.out.println("Good evening ");
    }
    public Parent(int age){
        this.age = age;
        value = 256;
    }



    abstract void career();

    abstract void partner();
}
