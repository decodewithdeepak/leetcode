class Solution {
    public ListNode reverseList(ListNode head) {

        // Iterative Method 

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

        // Recursive Method 

        // if (head == null || head.next == null) {
        //     return head;
        // }
        
        // ListNode newHead = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        
        // return newHead;

    }
}
