class TimeMap {
    Map<String, TreeMap<Integer, String>> map = new HashMap<>();
    /** Initialize your data structure here. */
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new TreeMap<>());
        }
        TreeMap<Integer, String> treeMap = map.get(key);
        treeMap.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        
        TreeMap<Integer, String> treeMap = map.get(key);
        
        //greatest key less than or equal to the given key
        Integer smallTimeStamp = treeMap.floorKey(timestamp);
        if(smallTimeStamp == null){
            return "";
        }
        return treeMap.get(smallTimeStamp);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */