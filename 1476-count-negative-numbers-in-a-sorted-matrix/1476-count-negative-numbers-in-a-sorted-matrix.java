class Solution {
  public int countNegatives(int[][] grid) {
    int m = grid.length, n = grid[0].length; 

    int count = 0;
    for(int i = 0;i < m; i++){
      count += checkInThisRow(grid[i],n);
    }
    return count;
  }

  public int checkInThisRow(int row[], int n){
    int low = 0, high = n-1;

    while(low <= high){
      int mid = (low + high) /2;

      if(row[mid] < 0){
        high = mid - 1;
      }
      else {
        low = mid+1;
      }
    }
    return n-low;
  }
}