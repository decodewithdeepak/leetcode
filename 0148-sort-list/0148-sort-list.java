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
    public ListNode sortList(ListNode head) {
        // Merge Sort - O(nlogn) time and O(logn) space

        if (head == null || head.next == null) return head;

        // find the middle
        ListNode middle = middleNode(head);

        // divide the list into two parts
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        // sort the two parts recursively
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        // merge the two sorted parts
        return merge(leftHead, rightHead);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // merge two sorted lists
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // attach any remaining elements
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }

    public ListNode middleNode(ListNode head) {
        // (right middle for even length)
        ListNode slow = head;
        ListNode fast = head.next;

        // move slow by 1 and fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}