import java.util.*;
class T1
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
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n-i-1;j++)
        	{
        		if(ar[j]>ar[j+1])
        		{
        			int temp=ar[j];
        			ar[j]=ar[j+1];
        			ar[j+1]=temp;
        		}
        	}
        }
        System.out.println("First Smallest Element is="+ar[0]);
        int e1=ar[0];
        int j=1;
        int e2=ar[j];
        while(j!=n-1)
        {if(e2==e1)
        {
          e2=ar[j+1];
        }
         j++;
     }
        System.out.println("Second Smallest Element is="+e2);
	}
}