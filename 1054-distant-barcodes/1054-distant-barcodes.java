class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
      Map<Integer,Integer> map = new HashMap<>();
      
      for(int i : barcodes){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        pq.addAll(map.keySet());
      
      int ans[] = new int[barcodes.length];
      
      int i = 0;
      
      while(!pq.isEmpty()){
        int key = pq.poll();
        int value = map.get(key);
        
        while(value > 0){
          ans[i] = key;
          value--;
          i += 2;
          
          if(i >= barcodes.length)
            i = 1;
        }
      }
      return ans;
    }
}