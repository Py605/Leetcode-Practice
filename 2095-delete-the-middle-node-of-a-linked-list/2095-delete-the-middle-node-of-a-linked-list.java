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
    public ListNode deleteMiddle(ListNode head) {
      if(head == null || head.next == null)
        return null;
      ListNode prev = head, slow = head,fast = head;
      
      while(fast != null && fast.next != null){
        fast = fast.next.next;
        prev = slow;
        slow = slow.next;
      }
      
      prev.next = slow.next;
      
      return head;
    }
}