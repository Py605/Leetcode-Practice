class Solution {
    public String countAndSay(int n) {
      String ans = "1";
      
      while(--n > 0){
        ans = say(ans);
    }
      return ans;
    }
  public String say(String ans){
    StringBuilder sb = new StringBuilder();
    int count = 1;
    for(int i = 0; i < ans.length()-1; i++){
      if(ans.charAt(i) == ans.charAt(i+1)){
        count++;
      }
      else{
        sb.append(count);
        sb.append(ans.charAt(i));
        count = 1;
      }
    }
    sb.append(count);
    sb.append(ans.charAt(ans.length()-1));
    return sb.toString();
  }
}