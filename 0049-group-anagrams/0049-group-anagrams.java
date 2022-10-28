class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      if(strs == null || strs.length == 0 )
        return new ArrayList<>();
      
      int n = strs.length;
      HashMap<String,List<String>> hm = new HashMap();
      for(String s: strs){
        String key = buildKey(s);
        List<String> list = list = hm.getOrDefault(key,new ArrayList<>());
          list.add(s);

          hm.put(key,list);
      }
      return new ArrayList<>(hm.values());
    }
  public String buildKey(String s){
    
    char freq[] = new  char[26];
    for(char c: s.toCharArray()){
      freq[c-'a']++;
    }
    
    return new String(freq);
  }
}