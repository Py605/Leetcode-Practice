class Solution {
  public int longestSubarray(int[] nums) {
    int zindex = -1, i = 0,j = 0, ans = 0;

    while(j < nums.length){
      if(nums[j] == 1){
        j++;
        continue;
      }
      else{
        if(zindex != -1){
          ans = Math.max(ans,j-i-1);
          i = zindex+1;
          zindex = j;
        }
        else
          zindex = j;
        j++;
      }
    }
    ans = Math.max(ans,j-i-1);
    return ans;
  }
}