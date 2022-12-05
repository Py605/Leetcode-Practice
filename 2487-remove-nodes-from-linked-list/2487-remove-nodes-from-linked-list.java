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
  /* Brute force:-
    Trying to store all those elements with the help of stack and then creating a new LL..
    T.C. & S.C. => O(N)..
    
  */
    public ListNode removeNodes(ListNode head) {
      ArrayList<Integer> al = new ArrayList();
      
      ListNode temp = head;
      
      while(temp != null){
        al.add(temp.val);
        temp = temp.next;
      }
      
      Stack<Integer> st = new Stack();
      
      for(int i = al.size()-1; i >= 0; i--){
        if(st.isEmpty())
          st.push(al.get(i));
        
        else if(st.peek() <= al.get(i))
          st.push(al.get(i));
      }
      
      // Now, create a new LL and asign every stack value sequentially...
      ListNode newHead = new ListNode(0);
      ListNode prev = newHead;
      while(!st.isEmpty()){
        ListNode curr = new ListNode(st.pop());
        prev.next = curr;
        prev = curr;
      }
      
      return newHead.next;
    }
}