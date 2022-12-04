class Solution {
    public int minimumAverageDifference(int[] nums) {
      int n = nums.length;
      
      int  ans = Integer.MAX_VALUE, index = -1;
      long tot_sum = 0, run_sum = 0;
      
      for(int i : nums)
        tot_sum += i;
      
      for(int i = 0;i < n; i++){
        run_sum += nums[i];
        
        long next_sum = tot_sum - run_sum;
        
        // System.out.println(run_sum +" " + next_sum);
        int res = (int)Math.abs((run_sum /(i+1)) - (i == n-1 ? 0 : (next_sum / (n-i-1))));
        
        if(res < ans){
          ans = res;
          index = i;
        }
      }
      return index;
    }
}