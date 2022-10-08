class Solution {
public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int result = -1;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                
                if(sum < target) start++;
                else if(sum > target) end--;
                else return target;
                
                if(Math.abs(target - sum) < closest) {
                    closest = Math.abs(target - sum);
                    result = sum;
                }
            }
        }
        
        return result;
    }
}