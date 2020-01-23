import java.util.*;
class dup
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		int b[]=new int[100];
		for(int i=0;i<n;i++)
			b[ar[i]]++;
        for(int i=0;i<n;i++)
        {
        	if(b[ar[i]]!=0)
        	{
        		System.out.print(ar[i]+" ");
        		b[ar[i]]=0;
        	}
        }
	}
}