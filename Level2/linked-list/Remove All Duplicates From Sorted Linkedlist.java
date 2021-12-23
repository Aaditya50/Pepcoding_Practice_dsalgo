import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
//ANSWER START
    public static ListNode removeDuplicates(ListNode head) {
    if(head == null || head.next == null) return head;
    
    ListNode dummy = new ListNode(-1);
    ListNode itr = dummy;
    itr.next = head;
    ListNode curr = head.next;
    
    while(curr != null){
        boolean is = false;
        while(curr != null && itr.next.val == curr.val){
            is = true;
            curr = curr.next;
        }
        
        if(is) itr.next = curr;
        else itr = itr.next;
        
        if(curr != null) curr=curr.next;
    }
    return dummy.next;
//ANSWER ENDS    
    }

    // InFput_code===================================================

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode makeList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = makeList(scn.nextInt());

        ListNode ans = removeDuplicates(head);
        printList(ans);
    }

}

/*
Input Format
1->1->1->4->5->6->6->7->8->9->9->9->null
Output Format
4->5->7->8->null
*/
