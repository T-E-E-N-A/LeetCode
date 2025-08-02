// Last updated: 8/2/2025, 11:31:24 PM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head.next==null){
            return null;
        }
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next!=null)
        slow.val = slow.next.val;
        if(slow.next!=null)
            slow.next = slow.next.next;
        return head;
    }
}