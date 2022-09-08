class Solution {
    public boolean checkDistances(String s, int[] distance) {
      HashMap<Character,Integer> hm = new  HashMap();
      
      for(int i = 0; i < s.length(); i++){
        char curr = s.charAt(i);
        if(hm.containsKey(curr)){
          int distan = i-hm.get(curr)-1;
          int posi = distance[curr-'a'];
          
          if(distance[(curr)-'a'] != distan)
            return false;
        }else{
          hm.put(curr,i);
        }
      }
    
      return true;
    }
}