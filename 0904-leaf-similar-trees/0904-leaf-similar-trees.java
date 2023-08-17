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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      ArrayList<Integer> al1 = new ArrayList();
      ArrayList<Integer> al2 = new ArrayList();

      pickLeaves(root1,al1);
      pickLeaves(root2,al2);

      return al1.equals(al2);
    }

    public void pickLeaves(TreeNode root, ArrayList<Integer> al){
      if(root == null){
        return ;
      }
      if(root.left == null && root.right == null){
        al.add(root.val);
      }
      pickLeaves(root.left,al);
      pickLeaves(root.right,al);
    }
}