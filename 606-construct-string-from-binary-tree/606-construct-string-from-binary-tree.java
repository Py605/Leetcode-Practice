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
  StringBuilder sb;
    public String tree2str(TreeNode root) {
      sb = new StringBuilder();
      preorder(root);
      return sb.toString();
    }
  public void preorder(TreeNode root){
    if(root == null)
      return;
    if(root.left == null && root.right==null){
      sb.append(root.val);
      return;
    }
    sb.append(root.val);
    sb.append('(');
    
    preorder(root.left);
    sb.append(')');
    
    if(root.right != null)
    {
      sb.append('(');
      preorder(root.right);
      sb.append(')');
    }
    return;
  }
}