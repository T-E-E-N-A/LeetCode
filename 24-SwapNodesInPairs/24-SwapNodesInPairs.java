// Last updated: 8/2/2025, 11:57:20 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t1 = new ListNode();
        t1.next = head;
        ListNode t2 = head;
        head = t1;
        while(t2!=null && t2.next!=null){
            t1.next = t2.next;
            t2.next = t2.next.next;
            t1.next.next = t2;
            t1 = t2;
            if(t1!=null) t2 = t1.next;
            else t2 = null;
        }
        return head.next;
    }
}