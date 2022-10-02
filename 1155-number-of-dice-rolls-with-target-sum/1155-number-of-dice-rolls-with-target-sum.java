class Solution {
    public int numRollsToTarget(int d, int f, int target) {
      int mod =(int) 1e9+7;
      int dp[][] = new int[d+1][target+1];
      dp[0][0] = 1;
      
      for(int dice = 1; dice <= d; dice++){
        for(int value = 0;value <= target; value++){
          for(int face = 1; face <= f; face++){
            if(value < face)
              continue;
            
            dp[dice][value] = (dp[dice][value] + dp[dice-1][value-face]) % mod;
          }
        }
      }
      return dp[d][target];
    }
}