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
    public boolean hasPathSum(TreeNode root, int target) {
      if(root == null)
        return false;
      return hasPathSum2(root,target,0);
    }
  
  public boolean hasPathSum2(TreeNode root, int target,int sum){
    if(root == null)
      return false;
    if(root.left == null && root.right == null)
        return sum+root.val == target;

      return hasPathSum2(root.left,target,sum+root.val) || hasPathSum2(root.right,target,sum+root.val);
  }

}