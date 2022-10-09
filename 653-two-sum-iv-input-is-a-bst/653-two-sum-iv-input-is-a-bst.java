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
  ArrayList<Integer> al ;
    public boolean findTarget(TreeNode root, int k) {
      al = new ArrayList();
      find(root,k);
      return twoSum(k);
    }
  
  public void find(TreeNode root, int k){
    if(root == null)
      return ;
      
    find(root.left,k);
    al.add(root.val);
    find(root.right,k);
  }
  public boolean twoSum(int target) {
        HashMap<Integer,Integer> h=new HashMap();

        int a[]=new int[2];
        int n=al.size();
        for(int i=0;i<n;i++)

        {

      if(h.containsKey(target-al.get(i))){
        return true;
      }
      h.put(al.get(i),i);
        }

        return false;
    }
}