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
  int count;
  int freq[];
    public int pseudoPalindromicPaths (TreeNode root) {
      count = 0;
      freq = new int[10];
      
      traverse(root);

      return count;
    }
  public boolean check(){

    int odds = 0;
    //if the node value's contains more than 1 odd people than, it can't be a pallindrome...
    for(int i =1; i <=9; i++){
      if(freq[i] % 2 != 0)
        odds++;
    }
    return odds >=2 ? false : true;
  }
  
  public void traverse(TreeNode root){
    if(root == null)
      return;
    
    if(root.left == null && root.right == null){
      freq[root.val]++;
      
      if(check())
        count++;
      freq[root.val]--;
      return;
    }
    
    //Adding the current value in frequency array..
    freq[root.val]++;
    if(root.left != null){
      traverse(root.left);
    }
    if(root.right != null){
      traverse(root.right);
    }
    
    //Removing the current value in frequency array..
      freq[root.val]--;
  }
}