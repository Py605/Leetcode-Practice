class Solution {
    public String reverseWords(String s) {
        char[] c= s.toCharArray();
        reverse(c,0,c.length-1);
        reverseWord(c);
        return removeExtraSpace(c);
    }
    
    private void reverse(char[] c,int i, int j){

        while(j >= i){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            
            i++;
            j--;
        }
    }
    
    private void reverseWord(char[] c){
        int i = 0;
        int curr = 0;
        boolean got = false;
        while(i < c.length){
            
            if(c[i] == ' '){ i++;continue; }
            
            if(!got){
                curr = i;
                got = true;
            }
            
            if(( i+1 == c.length || c[i+1] == ' ')){
                reverse(c,curr,i);
                got = false;
            }
            i++;
        }
        
    }
    
    private String removeExtraSpace(char[] a){
         int i = 0, j = 0;
      int n = a.length;
       while (j < n) {
           while (j < n && a[j] == ' ') j++;      
           while (j < n && a[j] != ' ') a[i++] = a[j++]; 
           while (j < n && a[j] == ' ') j++;             
           if (j < n) a[i++] = ' ';                    
         }
        return new String(a).substring(0,i);
    }
}