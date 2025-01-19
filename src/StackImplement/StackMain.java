package StackImplement;

public class StackMain {

    public static void main(String[] args) throws StackException{

       CustomStack stack = new DynamicStack(5);
        stack.push(56);
        stack.push(45);
        stack.push(40);
        stack.push(42);
        stack.push(20);
        stack.push(20);
        stack.display();


//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());




    }
}
