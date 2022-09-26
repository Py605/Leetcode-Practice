class Solution {
    public boolean equationsPossible(String[] equations) {
      
      ArrayList<HashSet<Integer>> result = new ArrayList(26);
      
      for(int i = 0; i < 26; i++)
        result.add(new HashSet<>());
      
      //storing them..
      for(String s : equations){
        if(s.charAt(1)=='='){ // store in result like an adjacency list...
          int first = s.charAt(0)-'a';
          int target = s.charAt(3)-'a';
          
          HashSet<Integer> h1 = result.get(first);
          HashSet<Integer> h2 = result.get(target);
          
          h1.add(target);
          h2.add(first);
          
          result.set(first,h1);
          result.set(target,h2);
        }
      }
      
      
//      Now, checking for every != string...
      for(String s : equations){
        if(s.charAt(1)=='!'){ // do check...
          int first = s.charAt(0)-'a';
          int target = s.charAt(3)-'a';
          
          if(first == target)
            return false;
          boolean isVisited[] = new boolean[26];
          boolean flag = dfs(result,first,target,isVisited);
          if(flag == false){
            return false;
          }
        }
      }
     return true;   
    }
  public boolean dfs(ArrayList<HashSet<Integer>> result,int i, int target,boolean isVisited[]){
    if(i == target){
      return false;
    }
    
    isVisited[i] = true;
    HashSet<Integer> al = result.get(i);
    
    for(int j : al){
      if(isVisited[j]){
        continue;
      }
      boolean flag = dfs(result,j,target,isVisited);
      if(flag == false)
        return false;
    }
    return true;
  }
}