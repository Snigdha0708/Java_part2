import java.util.*;
class check
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n-1];
		for(int i=0;i<n-1;i++)
        ar[i]=s.nextInt();
    //bubble sort
    for(int i=0;i<n-1;i++)
    {
    	for(int j=0;j<n-i-2;j++)
    	{
    		if(ar[j]>ar[j+1])
    		{
    			int temp=ar[j];
    			ar[j]=ar[j+1];
    			ar[j+1]=temp;
    		}
    	}
    }
    int comp=1;
    int pos=0;
    if(ar[ar.length-1]!=n)
    	System.out.println("Missing number="+n);
    else
    {
    	while(pos!=ar.length)
    	{
    		if(comp!=ar[pos])
    			{System.out.println(comp);
    				break;
    			}
    		else
    		{
    			pos++;
    			comp++;
    		}
    	}
    }}}