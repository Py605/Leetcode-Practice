class Solution {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    for(int i : nums){
      pq.add(i);
    }

    int ans = pq.poll(),i = 0;
    while(!pq.isEmpty() && ++i < k){
      ans = pq.poll();
    }
    return ans;
  }
}