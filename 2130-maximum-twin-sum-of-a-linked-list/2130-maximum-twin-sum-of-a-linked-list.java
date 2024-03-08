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
    
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        // Find middle of the linked list
        ListNode middle = findMiddle(head);
        // Reverse the second half of the linked list
        ListNode secondHalf = reverseList(middle);
        // Pair sum
        int maxSum = 0;
        while (head != null && secondHalf != null) {
            maxSum = Math.max(maxSum, head.val + secondHalf.val);
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return maxSum;
    }
}