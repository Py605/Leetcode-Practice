class Solution {
    public boolean canReorderDoubled(int[] arr) {
      
      //for +ve integers.....
      int freq[] = new int[100001];
      for(int i : arr){
        if(i >= 0)
          freq[i]++;
      }
      boolean flag = doCheck(freq);
      
      if(!flag)
        return false;
      
      //for -ve integers.....
      freq = new int[100001];
      for(int i : arr){
        if(i < 0)
          freq[Math.abs(i)]++;
      }
      return doCheck(freq);
    }
  
  public boolean doCheck(int[] freq) {
      
      //double of 0 will be 0....
      boolean flag = true;
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
              if(x % 2 != 0)
              {
                flag = false;
                break;
              }
            }
            else{
              while(x-- > 0){
                freq[i*2]--;
              }
            }
          }
          
        }
      }
    
      return flag;
    }
}