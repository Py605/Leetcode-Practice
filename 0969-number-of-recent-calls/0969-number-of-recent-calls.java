class RecentCounter {
  Queue<Integer> pq ;
    public RecentCounter() {
      pq = new LinkedList();
    }
    
    public int ping(int t) {

        pq.add(t);
        while(!pq.isEmpty() && (t-3000) > pq.peek()){
          pq.remove();
        }
      
      return pq.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */