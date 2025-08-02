// Last updated: 8/2/2025, 11:56:09 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode greater = new ListNode(0);
        ListNode smaller = new ListNode(0);
        ListNode Gtail = greater;
        ListNode stail = smaller;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                stail.next = temp;
                stail = stail.next;
            }else{
                Gtail.next = temp;
                Gtail = Gtail.next;
            }
            temp = temp.next;
        }
        stail.next = greater.next;
        Gtail.next = null;
        return smaller.next;
    }
}