class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      int freq[] = new int[2001];
      
      for(int i : arr){
        freq[i+1000]++;
      }
      
      HashSet<Integer> h = new HashSet();
      
      for(int i : freq){
        if(i == 0)
          continue;
        
        if(h.contains(i)){
          return false;
        }
        else
          h.add(i);
      }
      return true;
    }
}