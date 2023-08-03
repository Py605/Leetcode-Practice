class Solution {
  List<String> mapping =  new ArrayList<>(List.of("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
  List<String> ans ;
    public List<String> letterCombinations(String digits) {
      ans = new ArrayList();
      if(digits.length() == 0){
        return ans;
      }
      backtrack(0,"",digits);

      return ans;
    }
    public void backtrack(int i, String temp, String digits){
      if(temp.length() == digits.length()){
        ans.add(temp);
        return;
      }

      String curr = mapping.get(digits.charAt(i)-'0');

      for(char c : curr.toCharArray())
      {
        backtrack(i+1,temp + c, digits);
      }
    }
}