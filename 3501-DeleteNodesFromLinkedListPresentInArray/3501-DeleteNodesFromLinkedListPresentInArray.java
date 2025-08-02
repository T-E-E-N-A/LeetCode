// Last updated: 8/2/2025, 11:29:32 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }
        ListNode temp = head;
        while(temp!=null){
            boolean check=false;
            if(temp.next!=null && set.contains(temp.next.val)){
                check=true;
            }
            if(check && temp.next!=null){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        if(set.contains(head.val)){
            head = head.next;
        }
        return head;
    }
}