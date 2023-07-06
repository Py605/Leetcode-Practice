class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int low = 0, high = nums.length;

    int ans = 0;
    while(low <= high){
      int mid = (low+ high)/2;

      if(gotSubarray(nums,target,mid)){
        ans = mid;
        high = mid-1;
      }
      else{
        low = mid+1;
      }
    }  
    return ans;    
  }
  public boolean gotSubarray(int nums[], int target, int x){
    // Now, try sliding window of size x...

    int i =0 ,count = 0;
    for(; i< x; i++){
      count += nums[i];
    }

    if(count >= target){
      return true;
    }

    for(; i < nums.length; i++){
      count += nums[i];
      count -= nums[i-x];

      if(count >= target){
        return true;
      }
    }
    return false;
  }
}