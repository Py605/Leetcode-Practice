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
      // if(n == 1)
      //   return null;
      int size = countNodes(head);
      if(n == size)
        return head.next;
      
      ListNode curr = head;
      for(int i = 0;i < size - n -1; i++){
        curr = curr.next;
      }
      curr.next = curr.next.next;
      
      return head;
    }
  public int countNodes(ListNode head){
    ListNode curr = head;
    int count = 0;
    while(curr != null){
      curr = curr.next;
      count++;
    }
    return count;
  }
}