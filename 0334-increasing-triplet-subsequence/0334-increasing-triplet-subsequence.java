class Solution {
    public boolean increasingTriplet(int[] nums) {
      int n = nums.length;
      
      if(n < 3)
        return false;
      
      int i = Integer.MAX_VALUE,j = Integer.MAX_VALUE;
      
      for(int index = 0;index < n; index++){
        
        if(nums[index] <= i){
          i = nums[index];
        }
        else if(nums[index] <= j){
          j = nums[index];
        }
        else{
          return true;
        }
      }
      return false;
    }
}