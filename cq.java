import java.util.*;
class Queue
{
	int ar[]=new int[5];
	int l=-1;
	int r=-1;
	//int i=0;
	boolean underflow()
	{
		if(l==-1&&r==-1)
			return true;
		else
			return false;
	}
	boolean overflow()
	{
		if((r==ar.length-1)&&l==0)
			return true;
		else if(l==r-1)
			return true;
		else
			return false;
	}
	void add(int a)
	{
		if(overflow())
		{
			System.out.println("Cannot add new element");
			return;
		}
		else if(l==-1&&r==-1)
		{
			l=0;
			r=0;
			//ar[r]=a;
		}
		else if(r==ar.length-1&&l!=0)
		{
			r=0;
			//ar[r]=a;
		}
		else
		{
			r++;
			//ar[r]=a;
		}
		ar[r]=a;
	}
	void remove()
	{
		if(underflow())
			System.out.println("Empty");
		else
		{
			if(l==r)
				{l=-1;
					r=-1;}
			else if(l==ar.length-1)
				l=0;
			else
				l++;
		}
		print();
		}
	void print()
	{
		if(l==-1)
		{
			System.out.println("Empty");
		}
		else
		{
			if(l<=r)
			{
				for(int i=l;i<r;i++)
					System.out.print(ar[i]+" ");
			}
			else
			{
				int j=l;
				for(int k=j;k<ar.length-1;k++)
				System.out.print(ar[k]+" ");
				j=0;
				for(int l=j;j<r;l++)
				System.out.println(ar[l]+" ");	
			}
		}
	}
}
class cq
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		CircularQueue c=new CircularQueue();
		c.add(1);
		c.add(2);
		c.print();
		//c.add(6);
	}
}