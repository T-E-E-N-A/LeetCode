// Last updated: 8/2/2025, 11:30:39 PM
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
    public ListNode removeNodes(ListNode head) {
        ListNode l1 = reverse(head);
        int max = 0;
        ListNode ans = new ListNode(0);
        ListNode finl = ans;
        while(l1!=null){
            if(l1.val>=max){
                ans.next = l1;
                ans = ans.next;
                max = Math.max(max,l1.val);
            }
            l1 = l1.next;
        }
        ans.next = null;
        return reverse(finl.next);
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev = head;
        ListNode curr = prev.next;
        head.next = null;

        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}