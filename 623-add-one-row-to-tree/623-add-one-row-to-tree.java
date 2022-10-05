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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
      // Edge Case...
      if(depth == 1){
        TreeNode curr = new TreeNode(val);
        curr.left = root;
        return curr;
      }
      
      Queue<TreeNode> qu = new LinkedList();
      qu.add(root);
      
      if(depth == 2){
        // do nothing...
      }
      else{
        int currDepth = 2;
        while(!qu.isEmpty()){
          int size = qu.size();
          
          for(int i = 0; i< size; i++){
            TreeNode curr = qu.remove();
            if(curr.left != null){
              qu.add(curr.left);
            }
            if(curr.right != null){
              qu.add(curr.right);
            }
          }
          currDepth++;
          
          if(currDepth == depth)
            break;
        }
      }
      
      while(!qu.isEmpty()){
        TreeNode curr = qu.remove();
        TreeNode left = curr.left;
        TreeNode right = curr.right;
        
        curr.left = new TreeNode(val);
        curr.right = new TreeNode(val);
        
        curr.left.left = left;
        curr.right.right = right;
      }
        return root;
    }
}