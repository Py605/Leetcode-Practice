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
  // Iterative sol..
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> ans = new ArrayList();
      Stack<TreeNode> st = new Stack();
      
      TreeNode curr = root;
      while(curr != null || !st.empty()) // until curr & stack both becomes null/empty..
      {
        //going to the extreme left as much as possible..
        while(curr != null){
          st.push(curr);
          curr = curr.left;
        }
        //than, add it into answer list and now traverse in right subtree..
        curr = st.pop();
        ans.add(curr.val);
        curr = curr.right;
      }
      return ans;
    }
  
}