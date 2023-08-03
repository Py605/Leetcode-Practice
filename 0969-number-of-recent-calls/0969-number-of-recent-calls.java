class RecentCounter {
  Queue<Integer> pq ;
    public RecentCounter() {
      pq = new LinkedList();
    }
    
    public int ping(int t) {
      int ans = 1;
      if(pq.isEmpty()){
        pq.add(t);
      }

      else{
        while(!pq.isEmpty() && (t-3000) > pq.peek()){
          pq.remove();
        }
        pq.add(t);
        ans = pq.size();
      }
      return ans;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */