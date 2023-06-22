class Solution {//Memoization...
    public int maxProfit(int[] prices, int fee) {
     int dp[][] = new int[prices.length][2];
        for(int i[] : dp)
            Arrays.fill(i,-1);
        return ans(0,1,prices,fee,dp);
    }
    public int ans(int i, int canBuy, int prices[],int fee,int dp[][]){
        if(i == prices.length)
            return 0;
        
        if(dp[i][canBuy] != -1)
            return dp[i][canBuy];
        int profit = 0; 
        if(canBuy == 1){//means i can buy stock...
            profit = Math.max(-prices[i]+ans(i+1,0,prices,fee,dp), 0 + ans(i+1,1,prices,fee,dp));
            //means weather i can buy it on that day or not...
        }
        else{//means i can sell stock...
            profit = Math.max(prices[i]+ans(i+1,1,prices,fee,dp) -fee, 0 + ans(i+1,0,prices,fee,dp));
            //means weather i can sell it on that day or not...
        }
        return dp[i][canBuy] = profit;
    }
}