/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  int count = 0;
    public int goodNodes(TreeNode root) {
      count = 0;
      check(root,Integer.MIN_VALUE);
      return count;
    }
  public void check(TreeNode curr,int prevMax){
    if(curr == null)
      return ;
    
    if(curr.val >= prevMax){
      count++;
      prevMax = curr.val;
    }
      check(curr.left,prevMax);
      check(curr.right,prevMax);
    
  }
}