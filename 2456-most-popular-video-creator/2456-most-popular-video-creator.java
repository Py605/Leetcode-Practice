class pair{
    String x;
    int y;
    pair(String x1,int y1){
        x=x1;
        y=y1;
    }
}
class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        List<List<String>> l=new ArrayList<>();
        Map<String,Long> m=new HashMap<>();
        Map<String,PriorityQueue<pair>> m1=new HashMap<>();
        int n=creators.length;
        for(int i=0;i<n;i++){
            if(!m.containsKey(creators[i])){
                m.put(creators[i],(long)views[i]);
            }
            else
                m.put(creators[i],(m.get(creators[i])+(long)views[i]));
            if(!m1.containsKey(creators[i])){
                m1.put(creators[i],new PriorityQueue<>((a,b)->a.y==b.y?(a.x.compareTo(b.x)):b.y-a.y));
            }    
            m1.get(creators[i]).add(new pair(ids[i],views[i]));
        }
        long max=0;
        for(long t:m.values())max=Math.max(max,t);
        
        for(String u:m.keySet()){
            
            if(m.get(u)==max){
                List<String> temp=new ArrayList<>();
                temp.add(u);
                PriorityQueue<pair> s1=m1.get(u);
                temp.add(s1.poll().x);
                l.add(temp);
            }
        }
        return l;
    }
}