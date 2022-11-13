class Solution {
    public String reverseWords(String s) {
      s = s.trim();
      String c[] = s.split(" ",-1);
      int last = c.length-1, first = 0;
      
      while(first < last){
        if(c[first] != ""){
          first++;
        }else if(c[last] != ""){
          last--;
        }
        else{
          String temp = c[first];
          c[first] = c[last];
          c[last] = temp;
          first++; last--;
        }
      }
       s = "";
      for(int i = c.length-1; i >= 0; i--){
        if(c[i] != "")
          s += c[i]+" ";  
      }
      return s.substring(0,s.length()-1);
    }
}