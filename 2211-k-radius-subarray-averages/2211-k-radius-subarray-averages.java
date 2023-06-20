class Solution {
  public int[] getAverages(int[] nums, int k) {
    if(k == 0)
      return nums;

    int n = nums.length;
    int arr[] = new int[n];
    Arrays.fill(arr,-1);

    if(k*2 >= n)
      return arr;

    long sum = 0;
    for(int i = 0;i < k * 2 + 1; i++){
      sum += nums[i];
    }
    arr[k] = (int)(sum/(k*2+1));

    // NOw, filling our array..
    for(int i = k+1; i < n-k; i++){
      sum -= nums[i-k-1];
      sum += nums[i+k];
      arr[i] = (int)(sum/(k*2+1));
    }

    return arr;
  }
}