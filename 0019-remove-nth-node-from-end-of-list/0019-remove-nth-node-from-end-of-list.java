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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(0,head);
        ListNode right=dummy;
        ListNode left=dummy;
        for(int i=0;i<=n;i++){
            if(right==null) return head;
             right=right.next;

        }
        while(right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;

        return dummy.next;
    }
}