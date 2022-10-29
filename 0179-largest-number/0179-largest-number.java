class Solution {
    public String largestNumber(int[] nums) {
       if(nums.length==0)
            return "";
        String[] conv=new String[nums.length];
        //convert it to a string array
        for(int i=0;i<nums.length;i++)
        {
            conv[i]=Integer.toString(nums[i]);
        }
        // for eg:[10,2]
        // a+b=102
        // b+a=210
        // compare numerical value of these 2 strings
        Arrays.sort(conv,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder res=new StringBuilder();
        //after sorting if the array starts with 0
        if(conv[0].equals("0"))
            return "0";
        for(int i=0;i<conv.length;i++)
        {
            res.append(conv[i]);
        }
        return res.toString();
    }
  
}