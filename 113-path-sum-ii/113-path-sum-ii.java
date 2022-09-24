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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList();
      preorder(root,targetSum,ans,new ArrayList(),0);
      return ans;
    }
  public void preorder(TreeNode root, int target,List<List<Integer>> ans,List<Integer> al, int sum){
    if(root == null)
      return ;
    if(root.left == null && root.right == null && root.val + sum == target){
      al.add(root.val);
      ans.add(new ArrayList(al));
      al.remove(al.size()-1);
      return;
    }
    
    //root
    al.add(root.val);
    preorder(root.left,target,ans,al,sum + root.val);
    preorder(root.right,target,ans,al,sum + root.val);
    al.remove(al.size()-1);
  }
}