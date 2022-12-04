class Solution {
    public int waysToSplitArray(int[] nums) {
      int n = nums.length;
      
      int count = 0;
      long tot_sum = 0, run_sum = 0;
      
      for(int i : nums)
        tot_sum += i;
      
      for(int i = 0;i < n-1; i++){
        run_sum += nums[i];
        
        if(run_sum >= tot_sum - run_sum){
          count++;
        }
      }
      return count;
    }
}