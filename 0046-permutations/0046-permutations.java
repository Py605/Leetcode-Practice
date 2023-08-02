class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList();

    backtrack(ans,new ArrayList<Integer>(),nums);

    return ans;
  }
  public void backtrack(List<List<Integer>> ans,List<Integer> cur, int nums[]){

    if(cur.size() == nums.length){
      ans.add(new ArrayList<>(cur));
      return ;
    }

    for(int num : nums){
      if(!cur.contains(num)){
        cur.add(num);
        backtrack(ans,cur,nums);
        cur.remove(cur.size()-1);
      }
    }
  }
}