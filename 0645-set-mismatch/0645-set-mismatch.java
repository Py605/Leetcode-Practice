class Solution {
    public int[] findErrorNums(int[] nums) {
      int n = nums.length;
      
      int freq[] = new int[n+1];
      int ans[] = new int[2];
      
      for(int i = 0; i < n; i++){
        freq[nums[i]]++;
      }
      
    for(int i = 1;i <= n; i++){
      if(freq[i] > 1){
        ans[0] = i;
      }
      else if(freq[i] == 0){
        ans[1] = i;
      }
    }
      return ans;
    }
}