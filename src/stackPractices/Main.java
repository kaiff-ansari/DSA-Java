package stackPractices;

public class Main {

    public static void main(String[] args) {

        customStack stack = new customStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();
        stack.pop();
        stack.displayStack();
    }
}
