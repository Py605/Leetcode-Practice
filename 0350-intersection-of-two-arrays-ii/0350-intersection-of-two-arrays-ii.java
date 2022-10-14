class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      ArrayList<Integer> al = new ArrayList();
      
      int first[] = new int [1001];
      for(int i : nums1)
        first[i]++;
      
      int sec[] = new int [1001];
      for(int i : nums2)
        sec[i]++;
      
      
      for(int i = 0; i < 1001; i++){
        int min = Math.min(first[i],sec[i]);
        
        while(min != 0){
          al.add(i);
          min--;
        }
      }
      
      int ans[] = new int[al.size()];
      int j = 0;
      for(int i : al){
        ans[j++] = i;
      }
      return ans;
    }
}