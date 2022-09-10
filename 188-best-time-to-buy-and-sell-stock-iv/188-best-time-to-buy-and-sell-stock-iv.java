class Solution {
    public int maxProfit(int k, int[] prices) {
      int n = prices.length;
      int temp[][] = new int[2][k+1];
      int curr[][] = new int[2][k+1];

      for (int i = n-1; i >= 0; --i)
        {
            for (int buy = 0; buy < 2; ++buy)
            {
                for (int cap = 1; cap <= k; ++cap)
                {
                    int take, noTake;
                    if (buy == 1) 
                    { // sell case...
                        take = curr[0][cap] - prices[i];
                        noTake = curr[1][cap];
                    }
                    else 
                    { // buy case...
                      
                      //buy at curr index..
                        take = curr[1][cap-1] + prices[i];
                      //do not buy at curr index..
                        noTake = curr[0][cap];
                    }
                    temp[buy][cap] = Math.max(take, noTake);
                }                
            }
            curr = temp;
        }
        
        return curr[1][k];
    }
}