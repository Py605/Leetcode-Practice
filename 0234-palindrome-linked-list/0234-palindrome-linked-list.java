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
    public boolean isPalindrome(ListNode head) {
      if(head == null || head.next == null)
        return true;
      
      // find first Node of Second middle half...
      ListNode middle = middleNode(head);
      
       //And then reverse the LL from that point...
      ListNode tempH = reverseList(middle);
      // And Now have two pointers to check both list... if they have equal nodes values or not....
      
      ListNode first = head;
      
      while(tempH != null){
        if(tempH.val != first.val){
          return false;
        }
        tempH = tempH.next;
        first = first.next;
      }
      
      return true;
    }
  
  public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        
        ListNode curr=head.next;
        ListNode temp=curr;
        head.next=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=head;
            head=curr;
            curr=temp;
        }
        return head;
    }
  public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode sec = head;
        while(first!=null && first.next!=null)
        {
            first=first. next.next;
            sec=sec.next;
        }
        return sec;
    }
}