class Solution {
    public boolean halvesAreAlike(String s) {
      int n = s.length();
      String a = s.substring(0,n/2);
      
      String b = s.substring(n/2);
      
      int vowel1 = 0,vowel2 = 0;
      
      for(char c : a.toCharArray()){
        if(isVowel(c)){
          vowel1++;
        }
      }
      for(char c : b.toCharArray()){
        if(isVowel(c)){
          vowel2++;
        }
      }
      return vowel1 == vowel2;
    }
  public boolean isVowel(char c){
    return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }
}