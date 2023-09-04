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
      al = new ArrayList();
      buildQueue(root);

      return al;
    }
    public void buildQueue(TreeNode root){
      if(root == null){
        return ;
      }
      Queue<TreeNode> qu = new LinkedList();

      qu.add(root);
      while(!qu.isEmpty()){
        List<Integer> temp = new ArrayList();

        int size = qu.size();
        for(int i = 0;i < size; i++){
          TreeNode cur = qu.poll();
          System.out.println(cur.val);

          if(cur.left != null){
            qu.add(cur.left);
          }
          if(cur.right != null){
            qu.add(cur.right);
          }
          temp.add(cur.val);
        }
        al.add(temp.get(temp.size()-1));
      }
    }
}