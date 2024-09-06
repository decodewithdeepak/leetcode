class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // save the head of even

        // separate odd and even
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        // connect even after odd
        odd.next = evenHead;
        return head;
    }
}