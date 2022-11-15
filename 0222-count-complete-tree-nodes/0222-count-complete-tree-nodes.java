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
  int[] count;
  public int countNodes(TreeNode root) {
    count = new int[1];
    
    inorder(root);
    return count[0];
  }
  public void inorder(TreeNode root){
    if(root == null)
      return ;
    
    inorder(root.left);
    count[0] += 1;
    inorder(root.right);
  }
}