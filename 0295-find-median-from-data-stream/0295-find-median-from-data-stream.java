class MedianFinder {
        PriorityQueue<Integer> min ;
        PriorityQueue<Integer> max ;
    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek() >= num){
            max.add(num);
        }
        else{
            min.add(num);
        }
        if(max.size() > min.size()+1){
            min.add(max.poll());
        }
        else if(max.size() < min.size()){
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size() == min.size()){
            return (max.peek()/2.0) + (min.peek()/2.0);
        }
        else return max.peek();
    }
}