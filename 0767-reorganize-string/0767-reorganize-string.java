class Solution {
    public String reorganizeString(String barcodes) {
      Map<Character,Integer> map = new HashMap<>();
      
      for(char i : barcodes.toCharArray()){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      
      PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        pq.addAll(map.keySet());
      
      char ans[] = new char[barcodes.length()];
      
      int i = 0;
      
      while(!pq.isEmpty()){
        char key = pq.poll();
        int value = map.get(key);
        while(value > 0){
          ans[i] = key;
          value--;
          i += 2;
          
          if(i >= barcodes.length())
            i = 1;
        }
      }
      String result = new String(ans);
      return checkIsItPossible(result) == true ? result : "";
    }
  public boolean checkIsItPossible(String result){
    int n = result.length()-1;
    
    for(int i = 0;i < n-1; i++){
      if(result.charAt(i) == result.charAt(i+1))
        return false;
    }
    return true;
  }
}