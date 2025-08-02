// Last updated: 8/2/2025, 11:57:18 PM
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
    public ListNode reverse(ListNode head,ListNode end){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=end){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int i=0;
        while( temp!=null && i<k){
            temp = temp.next;
            i++;
        }
        if(i<k){
            return head;
        }
        ListNode newHead = reverse(head,temp);
        head.next = reverseKGroup(temp,k);
        return newHead;
    }
}