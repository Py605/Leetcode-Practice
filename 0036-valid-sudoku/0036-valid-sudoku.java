class Solution {
  public boolean isValidSudoku(char[][] board) {
      Set rowSet = new HashSet<>();
      Set colSet = new HashSet<>();
      Set grid = new HashSet<>();

      for(int i = 0; i < board.length; i++) {
          for(int j = 0; j < board[0].length; j++) {
              if(board[i][j] == '.') {
                  continue;
              }

              if(!rowSet.add(String.valueOf(board[i][j]) + i) || !colSet.add(String.valueOf(board[i][j]) + j) || !grid.add(String.valueOf(board[i][j]) + i/3 + "-" + j/3)) {
                  return false;
              }
          }
    }
    
    return true;
  }
}