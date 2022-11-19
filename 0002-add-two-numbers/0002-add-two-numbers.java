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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        
        int count = 0;
        while(l1 != null && l2 != null){
            int num = l1.val + l2.val + count;
            count = num / 10;
            num = num % 10;
            
            ListNode temp = new ListNode(num);
            //inserting new node in answer ListNode...
            curr.next = temp;
            curr = curr.next;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        //checking if any nodes is still left..
        while(l1 != null){
            int num = l1.val + count;
            count = num / 10;
            num = num % 10;
            
            ListNode temp = new ListNode(num);
            //inserting new node in answer ListNode...
            curr.next = temp;
            curr = curr.next;
            
            l1 = l1.next;
        }
       while(l2 != null){
            int num = l2.val + count;
            count = num / 10;
            num = num % 10;
            
            ListNode temp = new ListNode(num);
            //inserting new node in answer ListNode...
            curr.next = temp;
            curr = curr.next;
            
            l2 = l2.next;
        } 
        
        //checking if count is still having something..
        if(count != 0){
            int num = count;
            ListNode temp = new ListNode(num);
            //inserting new node in answer ListNode...
            curr.next = temp;
            curr = curr.next;
        }
        
        return head.next;
    }
}