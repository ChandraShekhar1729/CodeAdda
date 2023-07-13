//{ Driver Code Starts
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends



class twoStacks
{
    int stack[]=new int[100];
    int sex1=0;
    int sex2 =99;
    //Function to push an integer into the stack1.
    void push1(int x)
    {
      stack[sex1]=x;sex1++;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       stack[sex2]=x;sex2--;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
       if(sex1==0) return -1;
       
       int ans=stack[sex1-1];sex1--;
       return ans;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
         if(sex2==99)return -1;
       
       int ans=stack[sex2+1];sex2++;
       return ans;
    }
}

