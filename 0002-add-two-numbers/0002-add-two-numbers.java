class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1:  4->9->9->5->9   |    95994   |   49959
        // l2:  1->9->7         |  +   791   | + 197
        // sum: 5->8->7->6->9   |  = 96785   | = 58769

        ListNode p1 = l1, p2 = l2; 
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;

        while (p1 != null || p2 != null || carry != 0) {
            int sum = carry + (p1 != null ? p1.val : 0) + (p2 != null ? p2.val : 0);
            carry = sum / 10;
            sum = sum % 10;

            curr.next = new ListNode(sum);
            curr = curr.next;

            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        return dummy.next; // head of sum
    }
}