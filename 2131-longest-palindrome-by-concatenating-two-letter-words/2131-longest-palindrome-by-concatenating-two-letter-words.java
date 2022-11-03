class Solution {
    public int longestPalindrome(String[] words) {
      Map<String,Integer> hm = new HashMap();
      
      for(String word : words){
        hm.put(word,hm.getOrDefault(word,0)+1);
      }
      
      // Finding Answer...
      int count = 0;
      boolean flag = false;
      for(String word : words){
        if(hm.containsKey(word)){
          
          if(isPallindrome(word)){
              int value = hm.get(word) ;
            if(value % 2 != 0){
              flag = true;
              value -= 1;
            }
            hm.remove(word);
            count += value * 2;
          }
          
          else if(checkItsOpposite(word,hm)){
            String word2 = getOpposite(word);
            int value1 = hm.get(word);
            int value2 = hm.get(word2);
            
            count += 4 * Math.min(value1,value2);
              hm.remove(word);
              hm.remove(word2);
          }
        }
      }
      if(flag)
        count += 2;
        return count;
    }
  public boolean isPallindrome(String temp){
    return temp.charAt(0) == temp.charAt(1);
  }
  public String getOpposite(String temp){
    return temp.charAt(1) +""+ temp.charAt(0);
  }
  
  public boolean checkItsOpposite(String temp,Map<String, Integer> hm){
    String word2 = getOpposite(temp);
    return hm.containsKey(word2);
  }
}