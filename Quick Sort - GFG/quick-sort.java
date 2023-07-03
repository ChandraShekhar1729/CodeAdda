//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high){
            return;
        }
        
        int pivotIndex=partition(arr,low,high);
        
        quickSort(arr,low,pivotIndex);
        quickSort(arr,pivotIndex+1,high);
        
    }
    static int partition(int arr[], int low, int high)
    {
        
        int pivotElement=arr[low];
        
        
        int smallerNumCount=0;
        
        for( int i=low+1;i<=high;i++){
            if(arr[i]<pivotElement)smallerNumCount++;
        }
        
        
        int temp=arr[low+smallerNumCount];
        arr[low+smallerNumCount]=pivotElement;
        arr[low]=temp;
        
        int i=low;
        int j=high;
        while(i<j){
           if(arr[i]<pivotElement){
               i++;
           } else if(arr[j]>=pivotElement){
               j--;
           }else{
               int temp1=arr[i];
               arr[i]=arr[j];
               arr[j]=temp1;
               i++;
               j--;
           }
            
            
            
        }
        
        return low+smallerNumCount;
        
        
    } 
}
