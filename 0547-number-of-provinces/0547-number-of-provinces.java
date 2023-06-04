class Solution {
  ArrayList<ArrayList<Integer>> adj;
  public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;

    adj = new ArrayList();

    for(int i = 0; i <= n ;i++){
      adj.add(new ArrayList());
    }

    // Now, connecting all nodes..
    for(int i = 0; i < n; i++){
      for(int j = 0; j< n ; j++){
        if(i != j && isConnected[i][j] == 1){
          ArrayList<Integer> first = adj.get(i+1);
          first.add(j+1);
          adj.set(i+1,first);
        }
      }
    }

    for(ArrayList<Integer> al: adj){
      System.out.println(al);
    }
    int ans = 0;
    boolean visited[] = new boolean[n+1];
    for(int i = 1; i <= n; i++){
      if(!visited[i]){
        ans++;
        dfs(i,visited);
      }
    }
    return ans;
  }

  public void dfs(int ind, boolean visited[]){
    if(visited[ind]){
      return ;
    }

    visited[ind] = true;
    for(int el : adj.get(ind)){
      dfs(el,visited);
    }
  }
}
