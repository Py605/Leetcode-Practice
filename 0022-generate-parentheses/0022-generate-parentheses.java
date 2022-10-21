class Solution {
  List<String> res;
    public List<String> generateParenthesis(int n) {
      res = new ArrayList();
      
      build(new Stack(),new StringBuilder(),0,n);
        
        //return answer list...
      return res;
    }
  public void build(Stack<Character> st,StringBuilder sb, int i, int n){
    //base case....
    if(i==n && st.isEmpty()){
      res.add(sb.toString());
      return;
    }
    
    
    System.out.println("i = "+i+", n = "+n);
    //if you can insert open bracket ['('], then do add...
    if(i<n){
      st.push('(');
      sb.append('(');
      build(st,sb,i+1,n);
      st.pop();
      sb.deleteCharAt(sb.length()-1); 
    }

    //if you can insert close bracket [')'], then do add...
    if(!st.isEmpty()){
      st.pop();
      sb.append(')');
      build(st,sb,i,n);
      st.push('(');
      sb.deleteCharAt(sb.length()-1);
    }
  }
}