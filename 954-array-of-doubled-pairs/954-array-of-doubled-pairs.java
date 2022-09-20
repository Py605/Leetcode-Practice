class Solution {
    public boolean canReorderDoubled(int[] arr) {
      Map<Integer,Integer> count = new TreeMap();
      
      for(int el : arr){
        count.put(el, count.getOrDefault(el,0)+1);
      }
      
      for(int el : count.keySet()){
        if(count.get(el) == 0)
          continue;
        
        int target = el < 0 ? el/2 : el*2;
        
        //odd check
        if(el < 0 && el % 2 != 0)
          return false;
        
        if(count.get(el) > count.getOrDefault(target,0)){
          return false;
        }
        count.put(target, count.getOrDefault(target,0) - count.get(el));
      }
      return true;
    }
  
 
}