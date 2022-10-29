class Solution {
    public boolean isValid(String s) {
        int n = s.length();
      if(n % 2!= 0)
        return false;
      
      Stack<Character> st = new Stack();
      
      for(int i = 0;i < n; i++){
        char curr = s.charAt(i);
        
        if(curr == '(' || curr == '{' || curr == '[')
          st.push(curr);
        else{
          if(st.isEmpty())
            return false;
          else if(doTheyMatch(st.peek(),curr)){
            st.pop();
          }
          else
            return false;
        }
      }
      if(!st.isEmpty())
        return false;
      return true;
    }
  public boolean doTheyMatch(char f,char s){
    return (f == '(' && s == ')') || (f == '[' && s == ']') || (f == '{' && s == '}');
  }
}