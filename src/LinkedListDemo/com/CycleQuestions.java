package LinkedListDemo.com;

public class CycleQuestions {

        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return true;
                }

            }
            return false;

        }
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               // calculate length
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp !=slow );
                return length;
            }

        }
        return 0;

    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }

        }
        if(length == 0){
            return null;
        }
       // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0 ){
            s = s.next;
            length--;
        }

        // keep moving both forward and the will meet at cycle start
        while (f!= s){
            f = f.next;
            s = s.next;
        }
        return s;


    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public boolean isHappy(int n) {
            int slow = n;
            int fast = n;

           do {
              slow = findSquare(slow);
              fast = findSquare(findSquare(fast));

           }while (fast != slow);

           if(slow == 1){
               return true;
           }
           return false;

    }

    private int findSquare(int number){
            int ans = 0;
            while(number > 0){
                int rem = number % 10;
                ans+= rem * rem;
                number/= 10;

            }
            return ans;
    }

    public boolean isPalindrome(ListNode head) {
            ListNode mid = middleNode(head);
            ListNode headSecond = reverseList(mid);
            ListNode rerverseHead = headSecond;

            // compare both the halves
        while(head != null && headSecond != null){

            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

            reverseList(rerverseHead);
        if (head == null || headSecond == null ){
            return true;
        }
        else {
            return false;

        }

    }

    public ListNode reverseList(ListNode head){
            if(head == null){
                return head;
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

            return prev;
    }


    public void reorderList(ListNode head) {
            if(head == null || head.next == null){
                return;
            }

            ListNode mid = middleNode(head);
            ListNode hs = reverseList(mid);
            ListNode hf = head;

            //rearrange
            while (hf!= null && hs != null){
                ListNode temp = hf.next;
                hf.next = hs;
                hf = temp;
                temp = hs.next;
                hs.next = hf;
                hs = temp;

            }

            // next if tail to null
            if(hf != null){
                hf.next = null;
            }


    }

    // it also reversing < k end items -> modify it
    public ListNode reverseKGroup(ListNode head, int k) {

            if(k <= 1 || head  == null){
                return head;
            }

        ListNode current = head;
        ListNode prev = null;

        while (true){

            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++){
                current.next = prev;
                prev = current;
                current = next;

                if (next != null){
                    next = next.next;

                }

            }

            if(last != null){
                last.next = prev;
            }
            else {
                head = prev;
            }
            newEnd.next = current;

            if (current == null){
                break;
            }
            prev = newEnd;
        }

        return head;




    }

    public ListNode reverseAlternateKGroup(ListNode head, int k) {

        if(k <= 1 || head  == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (current != null){

            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++){
                current.next = prev;
                prev = current;
                current = next;

                if (next != null){
                    next = next.next;

                }

            }

            if(last != null){
                last.next = prev;
            }
            else {
                head = prev;
            }
            newEnd.next = current;
            // skip the k nodes
            for (int i = 0; current != null && i < k; i++){
                prev = current;
                current = current.next;
            }


        }

        return head;






    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        // skip the first left
        ListNode current = head;
        ListNode prev = null;
        for(int i = 0; current!= null && i < left -1; i++ ){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left +1; i++){
            current.next = prev;
            prev = current;
            current = next;

            if (next != null){
                next = next.next;

            }

        }

        if(last != null){
            last.next = prev;
        }
        else {
            head = prev;
        }
        newEnd.next = current;
        return head;

    }

    public ListNode rotateRight(ListNode head, int k) {

            if(k <= 0 || head == null || head.next == null){
                return  head;
            }

            ListNode last = head;
            int length = 1;
            while (last.next != null){
                last = last.next;
                length++;
            }

            last.next = head;
            int rotations = k % length;
            int skip = length - rotations;

            ListNode newLast = head;
            for (int i = 0; i < skip-1; i++){
               newLast =  newLast.next;

            }

            head = newLast.next;
            newLast.next = null;
            return head;

    }


    class ListNode {
    int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
}
