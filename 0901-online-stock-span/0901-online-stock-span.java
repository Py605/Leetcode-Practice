class StockSpanner {
    // Create that DS
  ArrayList<Integer> al;
    public StockSpanner() {
        //initialize that DS
      al = new ArrayList();
    }
    
    public int next(int price) {
      //count the previous continuous small elements and return count +  1;
      int count = 0;
      
      for(int i =  al.size()-1; i >=0; i--){
        if(al.get(i) <= price){
          count++;
        }
        else{
          break;
        }
      }
      al.add(price);
      return count + 1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */