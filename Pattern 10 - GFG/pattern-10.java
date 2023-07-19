//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int x=2*n;
        int a=x/2;
        int b=x-a-1;
        
        
        
        
        
        
        for( int i=0;i<a;i++){
            
            for( int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            
}

     for( int i=0;i<b;i++){
         for(int j=b-i-1;j>=0;j--){
             
             System.out.print("*"+" ");
             
         }
         System.out.println();
     }



    }
}