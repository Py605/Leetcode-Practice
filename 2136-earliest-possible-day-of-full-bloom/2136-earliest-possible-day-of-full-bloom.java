class Solution {
  
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
      int n = plantTime.length;
      int seeds[][] = new int[n][2];
      int sum = 0;


      // Storing them in an array...
      for(int i = 0; i < n; i++){
        seeds[i][0] = plantTime[i];
        sum += plantTime[i];
        seeds[i][1] = growTime[i];
      }
      
      //sorting them in descending order of growTime ... 
      Arrays.sort(seeds,(a,b)-> a[1] != b[1] ? b[1]-a[1] : b[0]-a[0]);

      seeds[0][1] += seeds[0][0];
      for(int i = 1;i < n; i++){
        seeds[i][0] += seeds[i-1][0];
        seeds[i][1] += seeds[i][0];        
      }
      
      int ans = 0;
      for(int i = 0;i < n; i++){
        ans = Math.max(ans,seeds[i][1]);
      }
      return ans;
    }
}