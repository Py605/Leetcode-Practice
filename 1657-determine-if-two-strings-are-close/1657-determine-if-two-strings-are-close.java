class Solution {
    public boolean closeStrings(String word1, String word2) {
      if(word1.length() != word2.length())
        return false;
      if(word1.equals(word2))
        return true;
      if(isPermutationOfOther(word1,word2)){
        return true;
      }
      
      
      return countFreqIfEqual(word1,word2);
    }
  public boolean isPermutationOfOther(String s, String t) {
    int freq[] = new int[26];
    
    for(char c: s.toCharArray()){
      freq[c-'a']++;
    }
    for(char c: t.toCharArray()){
      freq[c-'a']--;
    }
    
    for(int i = 0;i < 26; i++){
      if(freq[i] != 0)
        return false;
    }
    return true;
  }
  public boolean countFreqIfEqual(String s, String t) {
    int freq1[] = new int[26];
    int freq2[] = new int[26];
    
    HashSet<Character> h = new HashSet();
    for(char c: s.toCharArray()){
      freq1[c-'a']++;
      h.add(c);
    }
    for(char c: t.toCharArray()){
      freq2[c-'a']++;
      if(!h.contains(c))
        return false;
    }
    Arrays.sort(freq1);
    Arrays.sort(freq2);

    for(int i = 0;i < 26; i++){
      if(freq1[i] != freq2[i])
        return false;
    }
    return true;
  }
}