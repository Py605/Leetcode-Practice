class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m = obstacleGrid.length, n = obstacleGrid[0].length;
      int dp[][] = new int[m][n];
      
      for(int i[] : dp){
        Arrays.fill(i,-1);
      }
      return answer(0,0,m,n,obstacleGrid,dp);
    }
    public int answer(int i, int j, int m, int n, int grid[][],int dp[][]){
      if(grid[i][j] == 1){
        return 0;
      }
      if(i == m-1 && j == n-1){
        return 1;
      }

      if(dp[i][j] != -1){
        return dp[i][j];
      }
      int right = 0, down = 0;

      if(j < n-1){
        right = answer(i,j+1,m,n,grid,dp);
      }

      if(i < m-1){
        down = answer(i+1,j,m,n,grid,dp);
      }

      return dp[i][j] = right + down;
    }
}