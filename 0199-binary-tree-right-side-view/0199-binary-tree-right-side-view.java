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
    List<Integer> al;
    public List<Integer> rightSideView(TreeNode root) {
      al  = new ArrayList();
      inorder(root,0,0);
      return al;
    }
  public void inorder(TreeNode root, int i, int j){
    if(root == null)
      return ;
    
    if(al.size() > j){
      al.set(j,root.val);
    }
    else{
      al.add(j,root.val);
    }
    inorder(root.left, i-1,j+1);
    inorder(root.right, i+1,j+1);
  }
}