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
        ListNode slow = head;
        ListNode fast = head;

        // move fast by n
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // if fast is null, remove head
        if (fast == null) {
            return head.next;
        }

        // move slow and fast till fast reaches end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // remove the nth node
        slow.next = slow.next.next;

        return head;   
    }
}