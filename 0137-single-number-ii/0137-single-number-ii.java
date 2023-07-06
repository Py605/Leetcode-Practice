class Solution {
  // O(n) with extra space
  public int singleNumber(int[] nums) {
    HashMap<Integer,Integer> hm = new HashMap();

    for(int i : nums){
      hm.put(i,hm.getOrDefault(i,0)+1);
    }
    for(int i : hm.keySet()){
      if(hm.get(i) == 1){
        return i;
      }
    }
    return -1;
  }
}