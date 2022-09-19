class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans = new ArrayList();
      HashMap<String,List<String>> hm = new HashMap();
      
      int total = 0;
      for(String curr : paths)
      {
        String path[] = curr.split(" ");
        total += path.length -1;
        String root = path[0];
        
        for(int i = 1; i < path.length; i++){
          List<String> al = new ArrayList();
          
          String value = root + "/";
          
          int index = path[i].indexOf('(');
          String prefix = path[i].substring(0,index);
          
          String key = path[i].substring(index+1,path[i].length());
          value += prefix;
          
          
          // atlast adding in the hashmap...
          if(!hm.containsKey(key)){
            al.add(value);
            hm.put(key,new ArrayList(al));
          }
          else{
            List<String> temp = hm.get(key);
            temp.add(value);
            hm.put(key,new ArrayList(temp));
          }
        }
      }

      
      for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
            List<String> values = entry.getValue();
            int size = values.size();
            if(size > 1){
              ans.add(values);
            }
        }
        return ans;
    }
}