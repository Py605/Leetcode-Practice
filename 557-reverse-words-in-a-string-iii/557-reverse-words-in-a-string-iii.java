class Solution {
    public String reverseWords(String s) {
      String arr[] = s.split(" ");
      
      for(int i = 0; i < arr.length; i++){
        StringBuilder curr = new StringBuilder(arr[i]);
        arr[i] = curr.reverse().toString();
      }
      
      String ans = "";
      for(String curr : arr){
        ans += curr;
        ans += " ";
      }
      return ans.substring(0,ans.length()-1);
    }
}