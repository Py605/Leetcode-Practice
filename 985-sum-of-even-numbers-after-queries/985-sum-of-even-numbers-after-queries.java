class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
      int n = nums.length;
      int ans[] = new int[queries.length];
      
      HashSet<Integer> h = new HashSet();
      int sum = 0;

      //storing the sum & indices of even elements....
      for(int i = 0; i < n; i++){
          if(nums[i] % 2 == 0){
            sum += nums[i];
            h.add(i);
          }
      }
      
      for(int i = 0; i < queries.length; i++){
        int index = queries[i][1], val = queries[i][0];
        
        int prev = nums[index];
        nums[index] += val;
        
        if(nums[index] % 2 == 0){
          if(h.contains(index))
            sum += nums[index] - prev;
          else
          {
            sum += nums[index];
            h.add(index);
          }
        }
        else{
          if(h.contains(index)){
            h.remove(index);
            sum -= prev;
          }
        }
        ans[i] = sum;
      }
      return ans;
    }
}