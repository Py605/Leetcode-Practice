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
  public int pairSum(ListNode head) {
    ListNode last = findMid(head);

    ListNode newHead = last.next;
    last.next = null;

    newHead = reverse(newHead);

    // now, let's run both head & newHead together to find the maximum sum of both of them..

    int ans = 0;
    while(head != null){
      int temp = head.val + newHead.val;
      ans = Math.max(ans, temp);
      head = head.next;
      newHead = newHead.next;
    }

    return ans;
  }
  public ListNode reverse(ListNode head){
    ListNode first = head, prev = null;

    while(first != null){
      ListNode next = first.next;
      first.next = prev;
      prev = first;
      first = next;
    }

    return prev;
  }
  public ListNode findMid(ListNode head){
    ListNode slow = head, fast = head,prev = slow;

    while(fast != null && fast.next != null){
      fast = fast.next.next;
      prev = slow;
      slow = slow.next;
    }

    return prev;
  }
}