// Last updated: 8/2/2025, 11:55:40 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
		ListNode meet = hasCycle(head);
		if (meet == null) {
			return null;
		}
		ListNode slow=head;
		ListNode fast=meet;
        if(head==meet){
            return head;
        }
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.next;
    }
    public ListNode hasCycle(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (slow == fast) {
				return slow;
			}
		}

		return null;

	}
}