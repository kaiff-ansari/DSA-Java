package LinkedListDemo.com;

class circular{
    private Node head;
    private Node tail;

    public void insertFirst(int val){

        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;

        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;

       if(head !=  null){
           do {
               System.out.print(temp.val + "->" );
               temp = temp.next;

           }while (temp != head);
       }
        System.out.println("head");
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }


        do{
            Node n = head.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;

        }while (node != head);
    }




    private class Node{
         int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
public class PCLL {

    public static void main(String[] args){
        circular list = new circular();
        list.insertFirst(45);
        list.insertFirst(46);
        list.insertFirst(48);
        list.display();
        list.delete(46);
        list.display();



    }
}
