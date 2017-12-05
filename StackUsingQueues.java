import java.util.*;

//-----------------Driver Code---------------------//
class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			StackWithQueue g = new StackWithQueue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}
//----------------------Driver Program-----------------//
class StackWithQueue
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    if(q1.isEmpty() && q2.isEmpty())
	        return -1;
	        
	    int element;
	    if(!q1.isEmpty()){
	        element = q1.remove();
	        return element;
	    } else {
	        while(q2.size() != 1){
	            element = q2.remove();
	            q1.add(element);
	        }
	        Queue<Integer> temp = q1;
	        q1 = q2;
	        q2 = temp;
	        return q1.remove();
	        
	    }
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    if(q1.isEmpty()){
	        q1.add(a);
	    } else {
	        q2.add(q1.remove());
	        q1.add(a);
	    }
    }
}
