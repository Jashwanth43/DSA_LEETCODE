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
    public ListNode rotateRight(ListNode head, int k) {
      ListNode tail=head;
      if(head==null) return head;
      int length=1;
      while(tail.next!=null){
        length++;
        tail=tail.next;
      }  
      k=k%length;
      if (length==0 || k==0) return head;
      int val=(length-k-1);
      ListNode cur=head;
      for(int i=0;i<val;i++){
        cur=cur.next;
      }
      ListNode newHead=cur.next;
      cur.next=null;
      tail.next=head;
      return newHead;
    }
}