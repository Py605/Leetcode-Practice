class Solution {
    public int largestAltitude(int[] gain) {
      int tot_sum = 0,ans = 0;

      for(int i : gain){
        tot_sum += i;
        ans = Math.max(ans,tot_sum);
      }
      return ans;
    }
}