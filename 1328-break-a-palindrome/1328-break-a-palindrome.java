class Solution {
    public String breakPalindrome(String s) {
      int n = s.length();
      
      if(n == 1)
        return "";
      
      int i = 0;
      while(i < n && s.charAt(i) == 'a'){
        i++;
      }
      
      if(i < n){
        if(itGotsOnlyOneNonAchar(s,i+1)){
          s = s.substring(0, n-1) + 'b';
        }
        else
          s = s.substring(0, i) + 'a'
              + s.substring(i + 1);
      }
      else{
        s = s.substring(0, i-1) + 'b';
      }
      return s;
    }
  public boolean itGotsOnlyOneNonAchar(String s, int j){
    for(int i = j;i < s.length(); i++){
      if(s.charAt(i) != 'a')
        return false;
    }
    return true;
  }
}