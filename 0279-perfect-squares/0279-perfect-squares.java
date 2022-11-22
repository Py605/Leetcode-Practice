class Solution {
  int dp[];
    public int numSquares(int n) {
      dp = new int[n+1];
      return helper(n);
    }
  public int helper(int n){
    
    if(n == 0)
      return 0;

    if(dp[n] > 0)
      return dp[n];
    int min = n;
    for(int i = 1; i*i <= n; i++){
      min = Math.min(min, helper(n - i*i));
    }
    return dp[n] = min + 1;
  }
}