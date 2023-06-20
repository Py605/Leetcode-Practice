class Solution {
  public void moveZeroes(int[] nums) {
    int i = 0, j = 0, n = nums.length;

    while(i < n && j < n){
      // i will store non-zero elements....
      while(i < n && nums[i] == 0){
        i++;
      }
      // j will store zero elements index....
      while(j < n && nums[j] != 0){
        j++;
      }
      // now, swaping..
      if(i >= n || j >= n)
      return ;
      
      if(i < j){
        i++;
        continue;
      }
      int temp = nums[i]; 
      nums[i] = nums[j];
      nums[j] = temp;
    }
  }
}