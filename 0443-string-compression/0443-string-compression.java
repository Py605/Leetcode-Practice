class Solution {
    public int compress(char[] chars) {
      int count = 0;
      int ind = 0;
      int i = 0, j = 0, n = chars.length;
      
      while(j < n)
      {
        while(j < n && chars[i] == chars[j]){
          j++;
          count++;
        }
      System.out.println(count);

          chars[ind++] = chars[i];
          if(count == 1)
          {
            count = 0;
            i = j;
            continue;
          }
          String temp = Integer.toString(count);
          for(char c : temp.toCharArray())
            chars[ind++] = c;
          i= j;
          count = 0;
        
      }
      if(count == 1)
        ind++;
      return ind;
    }
}
/*
["a","a","a","b","b","a","a","a","c"]
["a","a","b","b","c","c","c"]
["a"]
*/