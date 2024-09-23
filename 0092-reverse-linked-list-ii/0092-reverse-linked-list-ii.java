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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode p1=head;
        ListNode p2=head;
        // move p1 and p2 to left and right
        for(int i=1;i<left;i++){
            p1=p1.next;
        }
        for(int i=1;i<right;i++){
            p2=p2.next;
        }
        
        // store the values of nodes in an arraylist
        ArrayList<Integer> arr=new ArrayList<>();
        // add the values of nodes from left to right
        ListNode temp=p1;
        while(temp!=p2.next){
            arr.add(temp.val);
            temp=temp.next;
        }

        // from right to left, replace the values of nodes with arraylist values
        int l = arr.size()-1;
        while(p1!=p2.next){
            p1.val=arr.get(l);
            l--;
            p1=p1.next;
        }

        return head;
    }
}