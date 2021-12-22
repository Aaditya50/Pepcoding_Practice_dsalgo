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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null ) return list1!=null ? list1:list2;
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        while(p1 != null && p2 != null){
            if(p1.val<p2.val){
                prev.next = p1;
                p1 = p1.next;
            }else{
                prev.next = p2;
                p2 = p2.next;
            }
            prev = prev.next;
        }
        prev.next = p1 != null ? p1 :p2;
        return dummy.next;    
        
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);
        int m = scn.nextInt();
        ListNode h2 = createList(m);


        ListNode head = mergeTwoLists(h1, h2);
        printList(head);
    }
}

/*
Input Format
1->2->6->7->15->24->null
-1->0->6->17->25->null

Output Format
-1->0->1->2->6->6->7->15->17->24->25->null
*/
