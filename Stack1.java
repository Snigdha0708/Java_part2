import java.util.*;
class S
{
	 int ar[]=new int[10];
	  int i=-1;
void push(int n)
	{
		if(overflow()==true)
		{
			i++;
			ar[i]=n;
			//i++;
			//System.out.println(ar[i]);
		 // i++;
		}
		else
		{
			System.out.println("NOT!!");
		}
	}
 int pop()
	{
		int res=-1;
		if(underflow())
		{
          res=ar[i];
          //System.out.println(ar[i]);
          i--;
		}
		else
		{
			System.out.println("EMPTY!!");
		}
		return res;
	}
	 boolean overflow()
	{
		if(i<10)
			return true;
		else
			return false;
	}
	 boolean underflow()
	{
        if(i>=0)
        	return true;
        else
        	return false;
	}
	 int peek()
	{
		//System.out.println(i);
		return ar[i];
	}	
}
class Stack1
{
	public static void main(String[] args)
	 {
	 	Scanner s=new Scanner(System.in);
		
		S abc=new S();
		int n=s.nextInt();
		abc.push(n);
		int a=abc.peek();
		
		 System.out.println(a);
		  int b=abc.pop();
		 System.out.println(b);
		 int c=abc.pop();
		 System.out.println(c);
	}
	
}