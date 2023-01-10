//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class meetings{
    int start;
    int end;
    int index;
    
    meetings(int start, int end, int index)
    {
        this.start = start;
        this.end = end;
        this.index = index;
    }
}
    class meetingComparator implements Comparator<meetings> {
        @Override
        public int compare(meetings a, meetings b){
            if(a.end < b.end){
                return -1;
            }
            else if(a.end > b.end){
                return 1;
            }
            else{
                if(a.index < b.index){
                    return -1;
                }
                else
                    return 0;
            }
        }
    }

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meetings> al = new ArrayList<>();
        
        for(int i = 0;i < n; i++){
            al.add(new meetings(start[i], end[i], i+1));
        }
        meetingComparator sorrt = new meetingComparator();
        Collections.sort(al,sorrt);
        
        int count = 1;
        int endT = al.get(0).end; ;
        for(int i = 1;i < n; i++){
            meetings cur = al.get(i);
            if(cur.start > endT){
                endT = cur.end;
                count++;
            }
        }
        
        return count;
        
    }
}
