class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {      
      int low = 0, high = arr.length-1;
      
      while((high-low) > k-1)
      {
        int big = Math.abs(arr[high] - x);
        int small = Math.abs(arr[low] - x);
      
        if(big < small)
          low++;
        else
          high--;
      }
      
      List<Integer> al = new ArrayList();
      for(int i = low; i <= high; i++){
        al.add(arr[i]);
      }
      return al;
    }
}