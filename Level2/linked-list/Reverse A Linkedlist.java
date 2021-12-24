import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
     static ListNode th = null;
    static ListNode tt = null;
    
    public static void addFirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
    
   

    public static ListNode reverse(ListNode head) {
      ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = null;
            addFirst(curr);
            
            curr = temp;
        }
        return th;
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

        ListNode head = reverse(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
head = head.next;
        }
    }
}


/*
Input Format
1->2->3->4->5->6->7->null
Output Format
7->6->5->4->3->2->1->null
*/
