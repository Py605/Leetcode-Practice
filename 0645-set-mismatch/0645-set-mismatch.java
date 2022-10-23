class Solution {
    public int[] findErrorNums(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      
      int expectedSum = (n * (n+1))/2;
      int currSum = 0;
      
      int ans[] = new int[2];
      
      for(int i = 0; i < n-1; i++){
        if(nums[i] == nums[i+1])
        {
          ans[0] = nums[i];
        }
        else{
          currSum += nums[i];
        }
      }
      ans[1] = expectedSum - (currSum + nums[n-1]);
      return ans;
    }
}