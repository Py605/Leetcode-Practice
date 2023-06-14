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
  int diff = Integer.MAX_VALUE ;
  TreeNode prev;
  public int getMinimumDifference(TreeNode root) {
    preorder(root);
    return diff;
  }
  public void preorder(TreeNode root){
    if(root == null){
      return ;
    }

    preorder(root.left);
    
    if(prev != null){
      diff = Math.min(diff,root.val - prev.val);
    }
    prev = root;
    preorder(root.right);
  }
}