//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // 
    // int largest=arr[0];
    
    // for( int i=1;i<arr.length;i++){
    //     if(arr[i]>largest){
    //         largest=arr[i];
    //     }
    // }
    
    // int seclar=-1;
    // for( int i=0;i<arr.length;i++){
    //     if(arr[i]>seclar&&arr[i]<largest)
    //     seclar=arr[i];
    // }
    //     return seclar;
    
    
    
    
    int largest=arr[0];
    int smallest=-1;
    
    for( int i=1;i<arr.length;i++){
        
        if(arr[i]>largest){
            smallest=largest;
            largest=arr[i];
        }
        
        if(arr[i]<largest){
            if(arr[i]>smallest)
            smallest=arr[i];
        }
        
    }
    return smallest;
    
      
    }
}