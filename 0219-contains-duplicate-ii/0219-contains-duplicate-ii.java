class Solution {
  //using sliding window...
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> h = new HashSet();
      
      for(int i = 0;i < nums.length; i++){
        
        if(h.contains(nums[i])){
            return true;
        }
          h.add(nums[i]);
        if(i >= k)
          h.remove(nums[i-k]);
      }
      return false;
    }
}