// Last updated: 8/2/2025, 11:56:32 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int size=1;
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            size++;
            temp = temp.next;
        }
        temp.next = head;
        k = k%size;
        k = size-k;
        System.out.println(k);
        temp = head;
        for(int i=1 ; i<k ; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}