class Solution {
    public boolean canReorderDoubled(int[] arr) {
      List<Integer> al = new ArrayList();
      
      Arrays.sort(arr);
      for(int i : arr){
        if(i < 0){
          if(al.contains(i*2)){
            al.remove(al.indexOf(i*2));
          }
          else{
            al.add(i);
          }
        }
        else{
          if(i % 2 != 0){
            al.add(i);
            continue;
          }
          if(al.contains(i/2)){
            al.remove(al.indexOf(i/2));
          }
          else{
            al.add(i);
          }
        }
      }
      
      return al.size() == 0;
    }
  
 
}