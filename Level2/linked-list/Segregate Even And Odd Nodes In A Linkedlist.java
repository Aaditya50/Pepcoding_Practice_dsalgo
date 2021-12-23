import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
//ANSWER
    public static ListNode segregateEvenOdd(ListNode head) {
     if(head == null || head.next == null) return head;
            
            ListNode dummyEven = new ListNode(-1);
            ListNode dummyOdd = new ListNode(-1);
            ListNode eventail = dummyEven, oddtail = dummyOdd , curr = head;
            
            while(curr != null){
                if(curr.val % 2 == 0){
                    eventail.next = curr;
                    eventail = eventail.next;
                }else{
                    oddtail.next = curr;
                    oddtail = oddtail.next;
                }
                
                curr = curr.next;
                
            }
                eventail.next = dummyOdd.next;
                oddtail.next = null;
                return dummyEven.next;
              
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}


/*
Input Format
1->7->2->6->3->5->4->null
Output Format
2->6->4->1->7->3->5->null
*/
