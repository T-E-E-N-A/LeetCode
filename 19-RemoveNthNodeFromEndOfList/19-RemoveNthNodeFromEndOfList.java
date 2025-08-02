// Last updated: 8/2/2025, 11:57:28 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode main = new ListNode(0);
        main.next = head;
        ListNode help = main;
        for(int i=0 ; i<n ; i++){
            head = head.next;
        }
        while(head!=null){
            head = head.next;
            help = help.next;
        }
        if(help != null && help.next!=null)
            help.next = help.next.next;
        return main.next;
    }
}