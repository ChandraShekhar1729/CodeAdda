//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int Arr[] = new int[N];
            String[] inp = read.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                Arr[i] = Integer.parseInt(inp[i]);
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.EvenOddSum(N, Arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int evSum=0;
        int oddSum=0;
        for( int i=0;i<N;i++){
            if(i%2==0){
                evSum+=Arr[i];
            }
            else{
                oddSum+=Arr[i];
                
            }
          
            
            
            
        }
        
        list.add(evSum);
        list.add(oddSum);
        
        return list;
        
        
    }
}