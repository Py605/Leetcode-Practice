class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
      int n = jobDifficulty.length; 
      if(n < d)
        return -1;
      int dp[][] = new int[d+1][n];
      for(int i[] : dp){
        Arrays.fill(i,-1);
      }
      
      return dfs(jobDifficulty,dp,d,0);
    }
  public int dfs(int []jobDifficulty,int dp[][], int d,int ind){
    if(d == 1){
      int max = 0;
      for(int i = ind; i < jobDifficulty.length; i++){
        max = Math.max(max,jobDifficulty[i]);
      }
      return max;
    }
    
    if(dp[d][ind] != -1){
      return dp[d][ind];
    }
    
    int leftMax = -1;
    int res = Integer.MAX_VALUE;
    for(int i = ind; i < jobDifficulty.length -d+1; i++){
      leftMax = Math.max(leftMax,jobDifficulty[i]);
      int rightMax = dfs(jobDifficulty,dp,d-1,i+1);
      
      res =Math.min(res, leftMax + rightMax);
    }
    return dp[d][ind] = res;
  }
}