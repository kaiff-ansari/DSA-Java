package LinkedListDemo.com;

public class DLL {
    private Node head;

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node; // if head is not null then do this

        }

        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;

        }
        System.out.println("End");

        System.out.println("print in reverse ");
        while (last != null){
            System.out.print(last.val + "-> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(head == null){
            node.prev = null;
            head = node;
            return;

        }

        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }
    public Node find(int val){
        Node node = head;

        while (node != null){
            if(node.val == val){
                return node;
            }

            node = node.next;

        }
        return null;
    }

    public void insertAfter(int after, int val){
        Node p = find(after);

        if(p == null){
            System.out.println("dose not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;



        if(node.next != null){
            node.next.prev = node;
        }

    }


    private class Node{

        int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
