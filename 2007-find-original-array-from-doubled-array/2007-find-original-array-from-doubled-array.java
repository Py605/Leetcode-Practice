class Solution {
    public int[] findOriginalArray(int[] changed) {
      int n = changed.length;
      if(n % 2 != 0)
        return new int[0];
      
      int freq[] = new int[100001];
      
      for(int i : changed)
        freq[i]++;
      
      //double of 0 will be 0....
      boolean flag = true;
      int ans [] = new int[n/2];
      int j = 0;
      for(int i =0; i < 100001; i++)
      {
        int x = freq[i];
        
        if(x != 0){ 
          if(i > 50000 || x > freq[i*2])
          {
            flag = false;
            break;
          }
          else{
            if(i == 0){
              // if(x % 2 != 0)
              x = x/2;
              while(x-- > 0){
                ans[j++] = i;
              }
            }
            else{
                while(x-- > 0){
                ans[j++] = i;
                freq[i*2]--;
              }
            }
            
          }
        }
        
      }
      
      if(!flag)
        return new int[0];
      
      return ans;
    }
}