import java.util.*;
class a12
{
	 int search(int ar[],int x)
	{
		int pos=-1;
		int c=0;
		for(int i:ar)
		{
			c++;
          if(i==x)
          	{
          		pos=c;
          		break;
		}}
		return pos;
	}
	public static void main(String[] args) 
	{
		a12 ax=new a12();
		Scanner s=new Scanner(System.in);
		int ar[]=new int[5];
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
		}
		int x=s.nextInt();
		int a=ax.search(ar,x);
		System.out.println(a);
	}
	
}