class Solution {
      int res = 0; 
    public int maxLength(List<String> arr) {
      
      ans(new StringBuilder(), 0,arr);
      
      return res;
    }
  public void ans(StringBuilder sb, int i,List<String> arr){
    if(isUnique(sb.toString())){
      res = Math.max(res,sb.length()); 
    }
    else{
      return;
    }
    if(i == arr.size())
      return;
    StringBuilder temp = new StringBuilder(sb);
    sb.append(arr.get(i));
    ans(sb,i+1,arr);
    
    ans(temp,i+1,arr);
  }
  public boolean isUnique(String temp){
    HashSet<Character> h = new HashSet();
    for(char c: temp.toCharArray()){
      if(!h.contains(c))
        h.add(c);
      else
        return false;
    }
    return true;
  }
}