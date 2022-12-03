class Solution {
    public String frequencySort(String s) {
      PriorityQueue<int []> pq = new PriorityQueue<>((a1, a2) -> a2[0] != a1[0] ? a2[0] - a1[0] : a2[1] - a1[1]);
      
      int freq[] = new int[128];
      for(char c : s.toCharArray()){
        freq[c]++;
      }
      
      for(int i = 0;i < 128; i++){
        if(freq[i] != 0){
          pq.add(new int[]{freq[i],i});
        }
      }
      
      StringBuilder sb = new StringBuilder();
      while(!pq.isEmpty()){
        int temp[] = pq.remove();
        
        while(temp[0]-- > 0){
          int a = (temp[1]);
          sb.append((char)a);
        }
      }
      return sb.toString();
    }
}