package Annotation.com;

public interface A {

    // static interface methods should always have a body
    // call by the interface name

    static void greeting(){
        System.out.println("hey i am static method");
    }
    default void fun(){

        System.out.println("i am in A");

    }
}
