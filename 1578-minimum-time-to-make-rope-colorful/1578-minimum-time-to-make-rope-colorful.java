class Solution {
    public int minCost(String colors, int[] neededTime) {
      int count = 0; 
      int i = 0, j =1;
      while(j < colors.length()){
        if(colors.charAt(i) == colors.charAt(j)){
          if(neededTime[i] < neededTime[j]){
            count += neededTime[i];
            i = j; 
            j++;
          }
          else{
            count += neededTime[j];
            j++;
          }
        }
        else{
          i = j;
          j++;
        }
      }
      return count;
    }
}