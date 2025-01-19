package LinkedListDemo.com;

 class List{
    private Node head;
    private Node tail;
    private int size;

    public List(){
        this.size = 1;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        newNode.next= head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void Display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;

        }
    }

}
public class Practice {

    public static void main(String[] args) {
        List list1 = new List();
        list1.insert(6);
        list1.insert(8);
        list1.insert(78);



        list1.Display();


    }
}
