class Solution {
    public int pivotIndex(int[] nums) {
      int n = nums.length;
      
      long tot_sum = 0, run_sum = 0;
      
      for(int i : nums)
        tot_sum += i;
      
      for(int i = 0;i < n; i++){
        if(run_sum == tot_sum - run_sum- nums[i]){
          return i;
        }
        run_sum += nums[i];
      }
      return -1; 
    }
}