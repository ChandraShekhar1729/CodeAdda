//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    
    public static Node reverse( Node head){

      if(head==null||head.next==null){
		  return head;
	  }
	  Node smallans=reverse(head.next);
	  head.next.next=head;
	  head.next=null;

	  return smallans;}
    public static Node addOne(Node head) 
    { 
        //code here.
        Node rev=reverse(head);
		Node dummy=rev;

           Node prev=null;
		int digit=0;
		int carry=1;

		while(dummy!=null){
			digit=dummy.data+carry;
           if(dummy==rev){
             
              int val=digit%10;
			  
			  carry=digit/10;
			  dummy.data=val;

		   }else{

            int val=digit%10;
			  
			  carry=digit/10;
			  
			  dummy.data=val;
		   }
            	prev=dummy;
            dummy=dummy.next;
		


		}
		if(carry==1){
			Node temp=new Node(1);
			prev.next=temp;

		}

		return reverse(rev);
    }
}
