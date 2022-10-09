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
  HashSet<Integer> al ;
    public boolean findTarget(TreeNode root, int k) {
      al = new HashSet();
      return find(root,k);
    }
  
  public boolean find(TreeNode root, int k){
    if(root == null)
      return false;
    if(al.contains(k-root.val))
      return true;
    
    al.add(root.val);
    return find(root.left,k) | find(root.right,k);
  }
}
