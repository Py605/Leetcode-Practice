class Solution {
  int answer = 0;
  public int maximumRequests(int n, int[][] requests) {
    int incoming[] = new int[n];

    ans(requests,incoming,n,0,0);
    return answer;
 }
 public void ans(int[][] requests, int[] incoming, int n, int index, int count) {
   if(index == requests.length){
     for(int i : incoming){
       if(i != 0){
         return ;
       }
     }
     answer = Math.max(answer,count);
     return;
   }
    // picking up..
      incoming[requests[index][0]]--;
      incoming[requests[index][1]]++;
      
      ans(requests,incoming,n,index+1,count+1);

      // Not- picking up..
      incoming[requests[index][0]]++;
      incoming[requests[index][1]]--;
      
      ans(requests,incoming,n,index+1,count);
 }
}