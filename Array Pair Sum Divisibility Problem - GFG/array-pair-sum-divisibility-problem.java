//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] arr, int k) {
        int n = arr.length;
      int rem[] = new int[n];
      
      for(int i =0; i< n ;i++){
        rem[i] = arr[i] % k;
      }
      
      HashMap<Integer,Integer> h = new HashMap();
      
      for(int i : rem){
        if(h.containsKey(k-i)){
          h.put(k-i,h.get(k-i)-1);
          if(h.get(k-i) == 0)
            h.remove(k-i);
        }
        else if(i == 0 && h.containsKey(0)){
          h.put(0,h.get(0)-1);
          if(h.get(0) == 0)
            h.remove(0);
        }
        else{
          h.put(i,h.getOrDefault(i,0) +1);
        }
      }
      
      return h.size() == 0;
    }
}