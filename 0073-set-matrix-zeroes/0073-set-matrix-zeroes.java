class Solution {
  // T.C => O(M * N) &   S.C => O(max(M,N))
    public void setZeroes(int[][] matrix) {
      int m = matrix.length, n = matrix[0].length;
      
      HashSet<Integer> rows = new HashSet();
      HashSet<Integer> columns = new HashSet();

      // finding out the zeros cell....
      for(int i=0;i < m;i++){
        for(int j = 0;j < n; j++){
          if(matrix[i][j] == 0){
            rows.add(i);
            columns.add(j);
          }
        }
      }
    
      // Now, filling the matrix with the help of rows & columns....
      for(int i : rows){
        for(int j = 0; j < n; j++){
          matrix[i][j] = 0;
        }
      }
      for(int i : columns){
        for(int j = 0; j < m; j++){
          matrix[j][i] = 0;
        }
      }
    }
}