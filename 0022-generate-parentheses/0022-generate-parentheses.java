class Solution {
  List<String> res;
    public List<String> generateParenthesis(int n) {
      res = new ArrayList();
      // add equal no. of open and close brackets...
      build(new StringBuilder(),0,0,n);
        
      //return answer list...
      return res;
    }
  public void build(StringBuilder sb,int open, int close, int n){
    //base case....
    if(sb.length() == 2 * n){
      res.add(sb.toString());
      return;
    }
    
    //if you can insert open bracket ['('], then do add...
    if(open < n){
      sb.append('(');
      build(sb,open+1,close,n);
      sb.deleteCharAt(sb.length()-1); 
    }

    //if you can insert close bracket [')'], then do add...
    if(close < open){
      sb.append(')');
      build(sb,open,close+1,n);
      sb.deleteCharAt(sb.length()-1);
    }
  }
}