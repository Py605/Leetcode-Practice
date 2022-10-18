class Solution {
    public String longestCommonPrefix(String[] strs) {
      int i = 0;
      String ans = "";
      
      Arrays.sort(strs);
      String first = strs[0];
      System.out.println(first);
      if(first.length() == 0)
        return ans;
      while(i < first.length()){
        for(int j = 1; j < strs.length; j++){
          if(strs[j].length() <= i)
            return ans;
          if(strs[j].charAt(i) == first.charAt(i)){
            continue;
          }
          else{
            return ans;
          }
        }
        ans += first.charAt(i);
        i++;
      }
      return ans;
    }
}