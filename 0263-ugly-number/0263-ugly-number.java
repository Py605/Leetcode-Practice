class Solution {
    public boolean isUgly(int n) {
      if(n <= 0)
        return false;
      
      n = keepDividing(n,2);
      n = keepDividing(n,3);
      n = keepDividing(n,5);

      return n == 1;
    }
  public int keepDividing(int n, int k){
    while(n % k == 0){
      n /= k;
    }
    return n;
  }
}