class Solution {
  public List<String> summaryRanges(int[] nums) {
    int n = nums.length;

    List<String> ans = new ArrayList();

    if(n == 0){
      return ans;
    }
    int cur = 0, first = 0,val = nums[0];

    while(cur < n){
      if(val != nums[cur]){
        // pick that range and put it into answer list...
        String temp = String.valueOf(nums[first]);
        if(cur-1 != first){
          temp += "->" + nums[cur-1];
        }
        val = nums[cur];
        first = cur;
        ans.add(temp);
      }
      else{
        val++;
        cur++;
      }
    }

    // pick that range and put it into answer list...
        String temp = String.valueOf(nums[first]);
        if(cur-1 != first){
          temp += "->" + nums[cur-1];
        }
        ans.add(temp);
    return ans;
  }
}