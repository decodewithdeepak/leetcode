class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Method 1 - O(n) Space

        // ListNode temp1 = list1; // head of list1
        // ListNode temp2 = list2; // head of list2
        
        // ListNode dummy = new ListNode(0); // Dummy node to start the merged list
        // ListNode temp = dummy; // Pointer to dummy node
    
        // // Traverse both lists until we reach the end of one of the lists
        // while (temp1 != null && temp2 != null) {
        //     if (temp1.val < temp2.val) {
        //         temp.next = temp1;
        //         temp1 = temp1.next;
        //     } else {
        //         temp.next = temp2;
        //         temp2 = temp2.next;
        //     }
        //     temp = temp.next;
        // }
    
        // if (temp1 != null) {
        //     temp.next = temp1;
        // } else {
        //     temp.next = temp2;
        // }
    
        // return dummy.next;

        // Method 2 - O(1) Space

        ListNode dummy = new ListNode(0); // Dummy node to start the merged list
        ListNode current = dummy; // Pointer to dummy node
    
        // Traverse both lists until we reach the end of one of the lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
    
        // Attach remaining nodes of list1 or list2, if any
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
    
        return dummy.next;



    }
}