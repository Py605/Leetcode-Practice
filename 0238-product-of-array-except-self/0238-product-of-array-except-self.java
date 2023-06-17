class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int ans[] = new int[n];

    int product = 1;
    int zeros = 0;
    for(int i : nums){
      if(i == 0){
        zeros++;
      }
      else
        product *= i;
    }

    for(int i = 0;i < n; i++){
      if(nums[i] != 0){
        if(zeros == 0){
          ans[i] = product / nums[i];
        }
        else{
          ans[i] = 0;
        }
      }
      else{
        if(zeros == 1){
          ans[i] = product;
        }
        else{
          ans[i] = 0;
        }
      }
    }
    return ans;
  }
}