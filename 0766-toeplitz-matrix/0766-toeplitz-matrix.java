class Solution {
  public boolean isToeplitzMatrix(int[][] matrix) {
    
    int m = matrix.length;
      int n = matrix[0].length;
    HashMap<Integer,Integer> hm = new HashMap();
    
    for(int i = 0;i < m;i++){
      for(int j = 0;j < n; j++){
        if(hm.containsKey(i-j)){
          int value = hm.get(i-j);
          if(value != matrix[i][j])
            return false;
        }
        else{
          hm.put(i-j,matrix[i][j]);
        }
        
      }
    }
    
    return true;
  }
}