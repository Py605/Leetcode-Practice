class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String first = "", second = "";
      
      for(String curr : word1){
        first += curr;
      }
      for(String curr : word2){
        second += curr;
      }
      
      return first.equals(second);
    }
}