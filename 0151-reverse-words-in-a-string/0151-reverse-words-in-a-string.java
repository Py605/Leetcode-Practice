class Solution {
    public String reverseWords(String s) {
      s = s.trim();
      String paragraph[] = s.split(" ",-1);
      int n = paragraph.length;
      
        StringBuilder sb = new StringBuilder();
      for(int i = n-1;i >= 0; i--){
        if(paragraph[i] != "")
          sb.append(paragraph[i]+" ");
        // System.out.println(paragraph[i]);
      }
      return sb.toString().substring(0,sb.length()-1);
    }
}