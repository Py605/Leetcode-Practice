class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      return Math.max(maxConsecutive(answerKey,k,true),maxConsecutive(answerKey,k,false));  
    }

    public int maxConsecutive(String answerKey, int k, boolean flag){
       int i = 0, j = 0;

      while(i < answerKey.length()){
        if(answerKey.charAt(i) == (flag ? 'T':'F'))
          k--;
        
        if(k < 0){
          if(answerKey.charAt(j) == (!flag ? 'F':'T')){
            k++;
          }
          j++;
        }
        i++;
      }
      return i-j;
    }
}