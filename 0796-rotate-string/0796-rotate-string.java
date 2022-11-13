class Solution {
    public boolean rotateString(String s, String goal) {
      if(s.length() != goal.length())
        return false;
      
      s += s;
      int n = goal.length();
      for(int i = 0;i < n; i++){
        String temp = s.substring(i,n+i);
        if(temp.equals(goal))
          return true;
      }
      return false;
    }
}