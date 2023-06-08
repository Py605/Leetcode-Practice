class Solution {
  public int countNegatives(int[][] grid) {
    int n = grid[0].length; 

    int index = n-1, count = 0;
    for(int row[] : grid){

      while(index >= 0 && row[index] < 0){
        index--;
      }
      count += (n - index-1);
    }
    return count;
  }
}