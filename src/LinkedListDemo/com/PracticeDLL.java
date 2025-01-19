package LinkedListDemo.com;


 class Double{

     private Node head;

     private class Node{
         private int val;
         private Node next;
         private Node prev;

         public Node(int val){
             this.val =  val;
         }
         public Node(int val, Node next, Node prev){
             this.val =  val;
             this.next = next;
             this.prev = prev;
         }
     }

     public void insertFirst(int val){
         Node node = new Node(val);
         node.next = head;
         node.prev = null;

         if (head != null){
             head.prev = node;
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

         System.out.println("reverse");
         while (last != null){
             System.out.print(last.val + "->");
             last = last.prev;
         }
         System.out.println("start");
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
         node = last;
         node.prev = last;
     }

     public Node Find(int val){
         Node node =  head;

         while (node != null){
             if(node.val == val){
                 return node;
             }
             node = node.next;
         }
         return null;
     }

     public void insertAfter(int after,int val){
         Node p = Find(after);

         if(p == null){
             System.out.println("node doses not exist");
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
}
public class PracticeDLL {

    public static void main(String[] args) {
       Double list = new Double();
       list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(3);
        list.display();
        list.insertLast(78);
        list.insertAfter(4,58);
        list.display();



    }
}
