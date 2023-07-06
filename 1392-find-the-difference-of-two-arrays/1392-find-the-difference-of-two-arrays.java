class Solution {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> ans = new ArrayList();

    HashSet<Integer> hs = new HashSet();
    for(int i : nums2){
      hs.add(i);
    }

    Set<Integer> al = new HashSet();
    for(int i : nums1){
      if(!hs.contains(i)){
        al.add(i);
      }
    }

    ans.add(new ArrayList<Integer>(al));
    
    HashSet<Integer> hs2 = new HashSet();
    for(int i : nums1){
      hs2.add(i);
    }

    Set<Integer> al2 = new HashSet();
    for(int i : nums2){
      if(!hs2.contains(i)){
        al2.add(i);
      }
    }

    ans.add(new ArrayList<Integer>(al2));
    return ans;
  }
}