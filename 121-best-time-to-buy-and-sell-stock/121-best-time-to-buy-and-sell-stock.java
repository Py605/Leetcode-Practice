class Solution {
  public int maxProfit(int[] prices) {
      int n = prices.length;
      if(n == 1)
        return 0;
    
    int profit = 0, mini = prices[0];
    
    for(int i = 1; i < n; i++){
      // trying to sell it on this day...
      int cost = prices[i] - mini;
      profit = Math.max(profit,cost);
      
      // updating our minimum value in left side...
      mini = Math.min(mini, prices[i]);
    }
      return profit;
}
  
  
    // Brute force..
//     public int maxProfit(int[] prices) {
//       int n = prices.length;
//       if(n == 1)
//         return 0;
      
//       return profit(0,n,prices,-1);
//     }
//   public int profit(int i, int n, int prices[],int hasBrought)
//   {
//     //BASE CASE...
//     if(i == prices.length){
//       return 0;
//     }
    
//     int nothing = Integer.MIN_VALUE,buy = Integer.MIN_VALUE,sell = Integer.MIN_VALUE;
//     // do nothing...
//      nothing = profit(i+1,n,prices,hasBrought);
//     // buy if possible...
//     if(hasBrought == -1)
//       buy = profit(i+1,n,prices,prices[i]);

    
//     //sell if possible...
//     if(hasBrought != -1){
//       int curr = prices[i] - hasBrought;
//       sell = profit(i+1,n,prices,hasBrought);
//       sell = Math.max(sell, curr); 
//     }
    
//     return Math.max(nothing, Math.max(buy,sell));
//   }
}