class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//       int m = matrix.length;
//       int n = matrix[0].length;
      
//       int i = m-1, j = 0, row = 0, col =0;
      
//       while(i > 0){
//         row = i; 
//         ArrayList<Integer> al = new ArrayList();
        
//         while(col < n && row < m){
//           al.add(matrix[row][col]);
//           col++;
//           row++;
//         }
//         System.out.println(al);
//         i--;
//       }
//       return true;
//     }
  public boolean isToeplitzMatrix(int[][] matrix) {
    
    int m = matrix.length;
      int n = matrix[0].length;
    HashMap<Integer,ArrayList<Integer>> hm = new HashMap();
    
    for(int i = 0;i < m;i++){
      for(int j = 0;j < n; j++){
        ArrayList<Integer> al = hm.getOrDefault(j-i,new ArrayList<>());
        al.add(matrix[i][j]);
        
        hm.put(j-i,al);
      }
    }
    
    for (Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
            ArrayList<Integer> values = entry.getValue();
            int size = values.size();
      Collections.sort(values);
      if(values.get(0) != values.get(size-1))
        return false;
    }
    
    return true;
  }
}