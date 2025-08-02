// Last updated: 8/2/2025, 11:55:35 PM
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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t = head.next;
        ListNode p2 = new ListNode();
        p2.next = head;
        ListNode ans = p2;
        p2 = p2.next;
        while(t!=null){
            ListNode p1 = ans;
            while(p1!=p2){
                if(p1.next.val >= t.val){
                    p2.next = t.next; 
                    t.next = p1.next;
                    p1.next = t;
                    break;
                }else{
                    p1 = p1.next;
                }
            }
            if(p1==p2){
                p2 = p2.next;
            }
            t = p2.next;
        }
        return ans.next;
    }
}