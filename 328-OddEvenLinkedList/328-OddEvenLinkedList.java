// Last updated: 8/2/2025, 11:35:58 PM
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode start = head;
        ListNode end = head.next;
        ListNode ans = end;
        ListNode temp = head.next.next;
        while(temp!=null){
            start.next = temp;
            end.next=temp.next;
            if(temp.next!=null)
                temp = temp.next.next;
            else temp=null;
            start = start.next;
            end = end.next;
        }
        start.next = ans;
        if(end!=null)
        end.next = null;
        return head;
    }
}