class Solution {
  public long totalCost(int[] costs, int k, int candidates) {
    long ans = 0;
    PriorityQueue<Integer> first = new PriorityQueue(); 
    PriorityQueue<Integer> last = new PriorityQueue(); 

    int i = 0, n = costs.length;
    while(i < candidates){
      first.add(costs[i]);
      i++;
    }
    int j = n-1;
    while(j >= i && j >= (n - candidates)){
      last.add(costs[j]);
      j--;
    }
    System.out.println(first);
    System.out.println(last);
    while(k-- > 0){
      int fir = first.peek() != null ? first.peek() : Integer.MAX_VALUE, las = last.peek() != null ? last.peek() : Integer.MAX_VALUE;
      if(fir <= las){
        ans += first.remove();
        if(i <= j) 
          first.add(costs[i++]);
      }
      else{
        ans += last.remove();
        if(i <= j) 
          last.add(costs[j--]);
      }
    }
    return ans;
  }
}