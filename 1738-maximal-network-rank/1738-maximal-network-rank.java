class Solution {
  ArrayList<ArrayList<Integer>> adj ;
  public int maximalNetworkRank(int n, int[][] roads) {
    adj = new ArrayList();

    for(int i = 0;i < n; i++){
      adj.add(new ArrayList());
    }
    makeAdjList(roads);
    // finding Answer...........
    int maxRank = 0;
    // Iterate on each possible pair of nodes.
        for (int node1 = 0; node1 < n; ++node1) {
            for (int node2 = node1 + 1; node2 < n; ++node2) {
                int currentRank = adj.get(node1).size() +  adj.get(node2).size();

                // Find the current pair's respective network rank and store if it's maximum till now.
                if (adj.get(node1).contains(node2)) {
                    --currentRank;
                }
                maxRank = Math.max(maxRank, currentRank);
            }
        }
        // Return the maximum network rank.
        return maxRank;
  }
  public void makeAdjList(int roads[][]){
    for(int i[] : roads){
      adj.get(i[0]).add(i[1]);
      adj.get(i[1]).add(i[0]);
    }
  }
}