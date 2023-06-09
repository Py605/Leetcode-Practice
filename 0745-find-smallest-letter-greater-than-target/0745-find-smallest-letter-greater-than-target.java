class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int high = letters.length-1;

      int low = 0;
      while(low <= high){
        int mid = (low + high)/2;

        if(letters[mid] > target){
          high = mid - 1;
        }
        else{
          low = mid + 1;
        }
      }
      System.out.println("Low = "+ low);
      System.out.println("High = "+ high);

      if(low == letters.length){
        return letters[0];
      }
      return letters[high+1];
    }
}