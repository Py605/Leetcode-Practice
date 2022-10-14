class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      ArrayList<Integer> al = new ArrayList();
      
      for(int i = 0; i < nums1.length; i++){
        for(int j = 0; j < nums2.length; j++){
          if(nums1[i] == nums2[j]){
            al.add(nums1[i]);
            nums2[j] = -1;
            break;
          }
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