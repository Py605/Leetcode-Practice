class Solution {
    public boolean buddyStrings(String s, String goal) {
      int n = s.length(), m = goal.length();
      if(n != m || n == 1)
        return false;
      
      // s == goal(already)* to saare character equal hone chahiye...
      if(s.equals(goal)){
        return minTwoElementsEqual(s);
      }
      
      ArrayList<Integer> different = new ArrayList<>();
      for(int i = 0; i < n; i++){
        if(s.charAt(i) != goal.charAt(i)){
          different.add(i);
        }
      }
      if(different.size() != 2)
        return false;
      int i = different.get(0), j = different.get(1);
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }
  public boolean minTwoElementsEqual(String s){
    char arr[] = s.toCharArray();
    Arrays.sort(arr);
    
    for(int i = 0;i < arr.length-1; i++){
      if(arr[i] == arr[i+1])
        return true;
    }
    return false;
  }
}