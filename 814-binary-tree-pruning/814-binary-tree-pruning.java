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
    public TreeNode pruneTree(TreeNode root) {
      makeAnswer(root);
      if(root.left == null && root.right == null && root.val == 0)
        return null;
      return root;
    }
  public int makeAnswer(TreeNode root)
  {
    if(root == null)
      return 0;
    if(root.left == null && root.right == null)
        return (root.val == 0) ? 0 : 1;
    
      int left = makeAnswer(root.left);
      if(left == 0){
        root.left = null;
      }
      int right = makeAnswer(root.right);
      if(right == 0){
        root.right = null;
      }
    return left + right + root.val;
  }
}