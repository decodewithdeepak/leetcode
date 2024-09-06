class Solution {
    public boolean isPalindrome(ListNode head) {
        // find the middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        ListNode rev = reverseList(slow);
        ListNode curr = head;

        // compare the first and second half
        while(rev != null){
            if(rev.val != curr.val) return false;
            rev = rev.next;
            curr = curr.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }
}