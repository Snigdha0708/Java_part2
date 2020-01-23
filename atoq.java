import java.util.*;
class Queue
{
	int ar[]=new int[5];
	int l=-1;
	int r=-1;
	int i=0;
	boolean underflow()
	{
		if(l==-1)
			return true;
		if(l>r)
			return true;
		else
			return false;
	}
	boolean overflow()
	{
		if(r>=ar.length)
			return true;
		else
			return false;
	}
	void add(int a)
	{
		if(!overflow())
		{
       if(l==-1)
       {l=0;
         r=0;
         ar[i]=a;
     	++i;
     	++r;
     	print();
     }
     else
     {
     	ar[i]=a;
     	++i;
     	++r;
     	print();
     }
 }
		else
		{
			System.out.println("Cannot add new Element");
		}
	}
	void remove()
	{
		if(!underflow())
		{
          ++l;
          if(l==r)
          {
          	l=-1;
          	r=-1;
          }
          else
          {
          print();
      }
		}
		else
		{
			System.out.println("Empty Queue");
		}
		//print();
	}
	void print()
	{
		for(int j=l;j<r;j++)
			System.out.print(ar[j]+" ");
		System.out.println();
	}
}
class atoq
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[6];
		for(int i=0;i<6;i++)
			ar[i]=s.nextInt();
		Queue q=new Queue();
		for(int j=0;j<6;j++)
		q.add(ar[j]);
	    for(int l=0;l<6;l++)
	    	q.remove();
	}
}