//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int r)
    {
         // Your code here
         if(l>r){
             return;
         }
         
         int mid=(l+r)/2;
         int l1=mid-l+1;
         
         int l2=r-mid;
         
         int arr1[]= new int[l1];
         int arr2[]=new int[l2];
         
         int k=l;
         
         for(int i=0;i<l1;i++){
             arr1[i]=arr[k++];
         }
         
         for(int i=0;i<l2;i++){
             arr2[i]=arr[k++];
         }
         
         // merge two sorted arrays;
         
         int index1=0;
         int index2=0;
         int x=l;
         
         while(index1<arr1.length&&index2<arr2.length){
             if(arr1[index1]<arr2[index2]){
                 arr[x]=arr1[index1];
                 index1++;
                 x++;
             }
             else{
                 arr[x]=arr2[index2];
                 x++;
                 index2++;
             }
         }
         
         while(index1<arr1.length){
             arr[x]=arr1[index1];
             x++;
             index1++;
         }
         
         while(index2<arr2.length){
             arr[x]=arr2[index2];
             x++;
             index2++;
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code herei
        if(l>=r){
            return;
    }
    
    // recursion ko left part sort krna h
    int mid=(l+r)/2;
    
    mergeSort(arr,l,mid);
    
    
    // recursion ko right part sort krna h 
    
    mergeSort(arr,mid+1,r);
    
    merge(arr,l,r);
    
    
    
}
}
