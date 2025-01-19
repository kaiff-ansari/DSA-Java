package LinkedListDemo.com;

 class LList{

    private ListNode head;
    private ListNode tail;
    private int size;


     LList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        ListNode node = new ListNode(val);

        node.next = head;
        head = node;


        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){


        if(tail == null){
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertAtIndex(int val, int index){


        if(index == size){
            insertLast(val);
            return;
        }

        ListNode temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        ListNode node = new ListNode(val,temp.next);
        temp.next = node;
        size++;
    }

    public void display(){
        ListNode temp = head;

        while (temp != null){
            System.out.print(temp.val + " ->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public int deleteFirst(){

        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public ListNode getIndex(int index){
        ListNode node = head;

        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;

    }

    public int deleteLast(){


        if(size <= 1){
            return deleteFirst();
        }

        ListNode secondLast = getIndex(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        ListNode prev = getIndex(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public void insertRec(int val, int index){
        head = insertRec(val,index,head);

    }

    private ListNode insertRec(int val, int index, ListNode node){
        if(index == 0){
            ListNode  temp = new ListNode(val,node);
            size++;
            return temp;

        }

        node.next = insertRec(val,index-1,node.next);
        return node;

    }

    public void reverse(){
        if(size <= 2){
            return;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }

        head = prev;
    }


     public boolean detectCycle(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;

            if(f == s){
                return true;
            }
        }
        return false;


     }
     public int LengthCycle(ListNode head){
         ListNode f = head;
         ListNode s = head;

         while (f != null && f.next != null){
             f = f.next.next;
             s = s.next;

             if(f == s){
                 int length = 0;
                 ListNode temp = s;
                 do {
                     temp = temp.next;
                     length++;

                 }while(temp != s);
                 return length;

             }
         }
         return 0;


     }
     public ListNode middle(ListNode head){

        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next.next != null){

            f = f.next.next;
            s = s.next;
        }
        return s;
     }
     public ListNode reverse(ListNode head){

         ListNode prev = null;
         ListNode present = head;
         ListNode next = present.next;

         while (present != null){
             present.next = prev;
             prev = present;
             present = next;

             if(next != null){
                 next = next.next;
             }
         }
         return prev;
     }

     public void reorderList(ListNode head) {
         if (head == null || head.next == null) {
             return;
         }

         ListNode mid = middle(head);
         ListNode hs = reverse(mid);
         ListNode hf = head;

         while (hf != null && hs != null){
             ListNode temp = hf.next;

             hf.next = hs;
             hs.next = temp;
             temp = hf.next;




         }




     }

     public boolean isPalindrome(ListNode head) {

         ListNode mid = middle(head);
         ListNode hs = reverse(mid);
         ListNode hf = head;

         ListNode headReverse = hs;

         while (hf != null && hs != null){

             if(hf.val != hs.val){
                 break;
             }

             hf = hf.next;
             hs = hs.next;
         }


         reverse(headReverse);

      if(hs == null && hs == null){
          return true;
      }
      else {
          return false;
      }




     }

    private class ListNode{
        private int val;
        private ListNode next;

       public ListNode(int val){
            this.val = val;
        }
       public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
public class PC {

    public static void main(String[] args){
        LList list  = new LList();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.display();
        list.insertLast(13);
        list.display();
        list.insertAtIndex(45,2);
        list.display();
        list.deleteFirst();
        //System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(2));
        list.display();
        list.insertRec(56,1);
        list.display();
        list.reverse();

        list.display();


    }
}
