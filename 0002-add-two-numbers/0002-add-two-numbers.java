class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1:  4->9->9->5->9   |    95994   |   49959
        // l2:  1->9->7         |  +   791   | + 197
        // sum: 5->8->7->6->9   |  = 96785   | = 58769

        ListNode p1 = l1, p2 = l2; // pointers to traverse both lists
        ListNode dummy = new ListNode(-1); // dummy node
        ListNode curr = dummy; // current pointer to track the sum
        int carry = 0;

        // add the values of nodes and carry
        while (p1 != null || p2 != null) {
            // sum = carry + p1.val + p2.val
            int sum = carry + (p1 != null ? p1.val : 0) + (p2 != null ? p2.val : 0);
            
            int ld = sum % 10; // extract last digit of sum
            carry = sum / 10; // extract carry

            // make a new node of ld and add it to the list
            curr.next = new ListNode(ld);

            // move to next nodes
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
            curr = curr.next;
        }

        // add a new node of carry if it is not 0
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next; // head of sum
    }
}