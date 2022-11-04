class Solution {
    public String reverseVowels(String s) {
      Stack<Character> st = new Stack();
      
      for(char c : s.toCharArray()){
        if(isVowel(c))
          st.push(c);
      }
      
      String temp = "";
      for(char c : s.toCharArray()){
        if(isVowel(c))
          temp += st.pop();
        else
          temp += c;
      }
      return temp;
    }
  public boolean isVowel(Character c){
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
  }
}