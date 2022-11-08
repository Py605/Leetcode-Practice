class Solution {
    public String makeGood(String s) {
      Stack<Character> st = new Stack();
      
      for(char c : s.toCharArray()){
        if(st.isEmpty()){
          st.push(c);
        }
        else{
          if((st.peek() + 32 == c) || (st.peek() - 32 == c))
            st.pop();
          else
            st.push(c);
        }
      }
      
      StringBuilder sb = new StringBuilder();
      
      while(!st.isEmpty())
        sb.append(st.pop());
      
      return sb.reverse().toString();
    }
}