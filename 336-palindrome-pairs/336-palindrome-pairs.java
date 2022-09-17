class Solution {
  // Optimal code...
    public List<List<Integer>> palindromePairs(String[] words) {
       List<List<Integer>> ans = new ArrayList<>();

        //In future, we need to know the index of the word. For this purpose, we create a map
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) map.put(words[i], i);
      
      //1st case, if there is any Empty string...
      // then, that means it can give us pallindromic string after concat..
      
     if (map.containsKey("")) {
            Integer emptyStrIndex = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (emptyStrIndex != i && isPalindrome(words[i])) {
                    ans.add(Arrays.asList(i, emptyStrIndex));
                    ans.add(Arrays.asList(emptyStrIndex, i));
                }
            }
        }
      
      
      // 2nd case, if any word has its reverse pallindromic word...
       for (int i = 0; i < words.length; i++) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            if (map.containsKey(reversed)) {
                int reversedIndex = map.get(reversed);
                if (reversedIndex != i) {
                    ans.add(Arrays.asList(i, reversedIndex));
                }
            }
        }      
      // 3rd case, if some part of a word is already pallindromic, then we have to find if there exist any other word of same characters, which are essential to make our concatenation palindrome...
      
      for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 1; j < word.length(); j++) {
                String left = word.substring(0, j);
                String right = word.substring(j);

                if(isPalindrome(left)){
                    Integer foundIndex = map.get(new StringBuilder(right).reverse().toString());
                    if(foundIndex != null){
                        ans.add(Arrays.asList(foundIndex, i));
                    }
                }

                if(isPalindrome(right)){
                    Integer foundIndex = map.get(new StringBuilder(left).reverse().toString());
                    if(foundIndex != null){
                        ans.add(Arrays.asList(i, foundIndex));
                    }
                }
            }
        }
      
      return ans;
    }
  private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) if (str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }
}