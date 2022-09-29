class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {      
      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[1] != b[1]) ? (b[1] - a[1]) : (b[0] - a[0]));
      
      
      for(int i = 0; i < arr.length; i++){
        int diff = Math.abs(arr[i] - x);
        int temp[] = new int[]{arr[i],diff};
        pq.add(temp);
        
        if(pq.size() > k){
          pq.remove();
        }
      }
      
      List<Integer> al = new ArrayList();
      for(int i = 0; i <k; i++){
        int temp[] = pq.remove();
        al.add(temp[0]);
      }
      Collections.sort(al);
      return al;
    }
}