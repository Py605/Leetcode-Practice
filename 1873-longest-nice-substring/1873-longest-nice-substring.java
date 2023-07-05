class Solution {
  // Brute force
  public String longestNiceSubstring(String s) {

    int n = s.length();
    String ans = "";
    for(int i =0;i < n;i ++){
        String temp = "";
      for(int j = i;j <n; j++){
        temp += s.charAt(j);
        if(check(temp)){
          if(ans.length() < temp.length()){
            ans = temp;
          }
        }
      }
    }
    return ans;
  }
  public boolean check(String s){
    int freq[] = new int[128];
    
    for(char c : s.toCharArray()){
      freq[c]++;
    }
  
    for(int i = 65; i <= 91; i++){
      if((freq[i] > 0 && freq[i+32] > 0) || (freq[i] == 0 && freq[i+32] == 0)){
        continue;
      }
      else
        return false;
    }
    return true;
  }
}