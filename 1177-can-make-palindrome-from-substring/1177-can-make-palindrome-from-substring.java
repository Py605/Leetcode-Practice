class Solution {
  int freq[][];
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> ans = new ArrayList();
      int n = s.length();
      freq = new int[n+1][26];
      
      // making normal freq array...
      for(int i = 0;i < n ;i++){
        freq[i+1][s.charAt(i)-'a']++;
      }

      // making prefix freq array...
      for(int i = 1;i <= n ;i++){
        for(int j = 0; j < 26; j++){
          freq[i][j] += freq[i-1][j];
        }
      } 
      
      //dry run
      // for(int i = 0;i <= n ;i++){
      //   for(int j = 0; j < 26; j++){
      //     System.out.print(freq[i][j] +" ");
      //   }
      //   System.out.println();
      // } 
      
      for(int query[] : queries){
          ans.add(check(query[0],query[1]+1,query[2]));
      }
      return ans;
    }
  public boolean check(int low , int high, int k){
    
    int count = 0;
    for(int j = 0; j < 26; j++){
      if((freq[high][j] - freq[low][j]) % 2 != 0)
        count++;
    }
    System.out.print(count+" ");
    
    // if(count == high-low)
    //   return count < k;
    if(count <= 1)
      return true;
    if(k == 0 && count > 1)
      return false;
    
    if(count <= 3){
      return k >= 1;
    }
    return count/2 <= k;
  }
}