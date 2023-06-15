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
  int maxSum,ans;
  public int maxLevelSum(TreeNode root) {
    maxSum = Integer.MIN_VALUE;
    ans = 0;
    bfs(root);

    return ans;
  }
  public void bfs(TreeNode root){
    Queue<TreeNode> qu = new LinkedList();
    int  index = 1;
    
    qu.add(root);
    while(!qu.isEmpty()){
      int size = qu.size();
      int sum = 0;
      for(int i =0; i< size; i++){
        TreeNode curr = qu.poll();
        sum += curr.val;

        if(curr.left != null){
          qu.add(curr.left);
        }
        if(curr.right != null){
          qu.add(curr.right);
        }
      }
      if(sum > maxSum){
        maxSum = sum;
        ans = index;
      }
      index++;
    }
  }
}