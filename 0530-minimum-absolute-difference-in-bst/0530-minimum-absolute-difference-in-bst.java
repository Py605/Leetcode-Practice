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
  ArrayList<Integer> all;
  public int getMinimumDifference(TreeNode root) {
    all = new ArrayList();

    preorder(root);

    Collections.sort(all);

    int diff = Integer.MAX_VALUE;

    for(int i =0 ;i< all.size()-1; i++){
      if(all.get(i+1) - all.get(i) < diff){
        diff = all.get(i+1) - all.get(i);
      }
    }
    return diff;
  }
  public void preorder(TreeNode root){
    if(root == null){
      return ;
    }

    all.add(root.val);
    preorder(root.left);
    preorder(root.right);
  }
}