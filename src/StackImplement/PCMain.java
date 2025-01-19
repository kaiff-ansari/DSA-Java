package StackImplement;

public class PCMain {

    public static void main(String[] args) throws Exception {

        PCCircular q = new PCCircular(5);
        q.insert(45);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(78);
        q.display();
        q.remove();

        q.insert(40);
        q.display();
        q.remove();
        q.display();




    }
}
