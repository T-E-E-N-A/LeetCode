// Last updated: 8/2/2025, 11:56:06 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode temp = new ListNode(0);
        ListNode ans = temp;
        temp.next = head;
        for(int i=1 ; i<left ; i++){
            temp = temp.next;
        }
        // 1 is safely stored in temp; - first part of list
        ListNode tem = head;
        for(int i=1 ; i<right ; i++){
            tem = tem.next;
        }
        ListNode last = tem.next;
        tem.next = null;
        ListNode mid = reverse(temp.next);
        temp.next = mid;
        while(temp!=null && temp.next!=null) temp = temp.next;
        temp.next = last;

        return ans.next;
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