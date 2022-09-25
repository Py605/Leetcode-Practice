class MyCircularQueue {
    public int ll[];
    public MyCircularQueue(int k) {
      ll = new int[k];
      Arrays.fill(ll, -1);
    }
    
    public boolean enQueue(int value) {
      if(isFull())
        return false;
      
        for(int i = ll.length-1; i > 0; i--){
          ll[i] = ll[i-1];
        }
        ll[0] = value;
        return true;
    }
    
    public boolean deQueue() {
      if(isEmpty()){
        return false;
      }
      else{
        int index = -1;
        for(int i = ll.length-1; i >= 0; i--){
          if(ll[i] != -1){
            index = i;
            break;
          }
        }
        ll[index] = -1;
        return true;
      }
    }
    
    public int Front() {
      if(isEmpty())
        return -1;
      int index = -1;
        for(int i = ll.length-1; i >= 0; i--){
          if(ll[i] != -1){
            index = i;
            break;
          }
        }
      return ll[index];        
    }
    
    public int Rear() {
      return ll[0];
    }
    
    public boolean isEmpty() {
      return (ll[0] == -1);
    }
    
    public boolean isFull() {
      return (ll[ll.length-1] != -1);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */