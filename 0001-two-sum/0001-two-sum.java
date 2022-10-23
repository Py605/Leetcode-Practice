class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      
      HashMap<Integer,Integer> h = new HashMap();
      for(int i =0;i < n ;i++){
        int curr = target - nums[i];
          if(h.containsKey(curr))
            return new int[]{i,h.get(curr)};
        h.put(nums[i],i);
      }
      return new int[2];
    }
}