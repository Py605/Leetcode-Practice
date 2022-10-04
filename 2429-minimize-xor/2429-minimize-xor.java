class Solution {
    public int minimizeXor(int num1, int num2) {
        
        int count2 = Integer.bitCount(num2);
        
        int ans = 0;
        
        
        
        for (int i = 31; i >= 0; i--) {
            int curbit = (num1 >> i) & 1; 
            if (curbit == 1) {
                ans = ans | (1 << i); 
                count2--;
                if (count2 == 0) break;
            }
        }
        

        if (count2 > 0) {
            for (int i = 0; i < 32; i++) {
                if (((ans >> i) & 1) == 1) continue; 
                ans = ans | (1 << i);
                count2--;
                if (count2 == 0) break;
            }
        }
        
        return ans;
        
    }
}