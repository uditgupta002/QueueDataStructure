import java.util.*;
import java.util.Stack;
import java.util.LinkedList;



class Queue_Using_Two_Stacks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			QueueWithStacks g = new QueueWithStacks();
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.insert(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.remove()+" ");
			q--;
				
			}
			System.out.println();
		t--;
		}
	}
}

class QueueWithStacks
{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    /* The method insert to push element into the queue */
    void insert(int B)
    {
	    stack1.push(B);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
    	if(stack2.isEmpty() && stack1.isEmpty())
    	    return -1;
    	else if(!stack2.isEmpty())
    	    return stack2.pop();
    	else {
    	    while(!stack1.isEmpty())
    	        stack2.push(stack1.pop());
    	    return stack2.pop();
    	}
    }
}
