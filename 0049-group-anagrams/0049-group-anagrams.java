class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList();
      
      int n = strs.length;
      boolean flag[] = new boolean[n];
      for(int i = 0;i < n; i++){
        List<String> res = new ArrayList();
        if(flag[i])
          continue;
        res.add(strs[i]);
        for(int j = i+1;j < n;j++){
          
          if(!flag[j] && bothAnagram(strs[i],strs[j])){
            res.add(strs[j]);
            flag[j] = true;
          }
        }
        // if(res)
        answer.add(res);
      }
      return answer;
    }
  public boolean bothAnagram(String s,String t){
    if(s.length() != t.length())
      return false;
    
    int freq[] = new  int[26];
    for(int i = 0; i < s.length(); i++){
      freq[s.charAt(i)-'a']++;
      freq[t.charAt(i)-'a']--;
    }
    
    for(int i = 0; i < 26; i++){
      if(freq[i] != 0)
        return false;
    }
    
    return true;
  }
}