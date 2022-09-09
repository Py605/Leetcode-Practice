class Solution {
  //...
    public int numberOfWeakCharacters(int[][] properties) {
      int n = properties.length;
      
      //sorting in ascending array and then in desc. order(if attacks are equal) ...
      Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
      
      int count = 0, max = properties[n-1][1];
      for(int i = n-1; i >=0 ; i--){
        if(properties[i][1] < max) 
        {
                count++;
        } 
        else {
                max = properties[i][1];
        }
      }
      return count;
    }
}