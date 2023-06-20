class Solution {
    public boolean isSubsequence(String s, String t) {
      int i = 0, j = 0, n= s.length(), m = t.length();
      if(n == 0){
        return true;
      }
      if(m == 0){
        return false;
      }
      while(i < n && j < m){
          if(s.charAt(i) == t.charAt(j)){
            i++; j++;
          }
          else{
            j++;
          }

          if(i == n){
            return true;
          }
      }
      return false;
    }
}