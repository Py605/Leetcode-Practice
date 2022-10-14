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
    public void reorderList(ListNode head) {
      ListNode curr = head;
      
      ArrayList<Integer> al = new ArrayList();
      while(curr != null){
        al.add(curr.val);
        curr = curr.next;
      }
      
      int i = 0, j = al.size()-1;
      curr = head;
      boolean flag = true;
      while(i <= j){
        if(flag){
          curr.val = al.get(i);
          i++;
        }
        else{
          curr.val = al.get(j);
          j--;
        }
        curr = curr.next;
        flag = !flag;
      }
    }
}