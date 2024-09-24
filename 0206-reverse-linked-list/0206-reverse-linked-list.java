class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null; // if the list is empty

        // Traverse the list and store values in an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Reverse the values in the original linked list
        temp = head;
        int l = arr.size() - 1;
        while (temp != null) {
            temp.val = arr.get(l);  // Assign the values in reverse order
            l--;
            temp = temp.next;
        }

        return head;
    }
}
