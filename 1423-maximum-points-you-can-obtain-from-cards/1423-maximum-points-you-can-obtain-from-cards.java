class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int total = 0;
      
      for(int i : cardPoints){
        total += i;
      }
      
      int window = cardPoints.length-k;
      int run_sum = 0;
      
      int i = 0;
        
      for(;i < window; i++){
        run_sum += cardPoints[i];
      }
      
      int ans = total - run_sum;
      
      // now, checking every other subarray of length n-k;
      
      for(;i < cardPoints.length; i++){
        run_sum -= cardPoints[i - window];
        run_sum += cardPoints[i];    
        
        ans = Math.max(ans, total - run_sum);
      }
      return ans;
    }
}