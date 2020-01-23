import java.util.*;
class a121
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        	ar[i]=s.nextInt();
        int br[]=sort(ar);
        for(int j=0;j<br.length;j++)
        	System.out.println(br[j]);
    }
    static int[] sort(int br[])
    {
    	for(int i=0;i<br.length;i++)
    	{
    	for(int j=0;j<br.length-i-1;j++)
    	{
    		if(br[j]>br[j+1])
    		{
    			int temp=br[j];
    			br[j]=br[j+1];
    			br[j+1]=temp;
    		}
    	}	
    	}
    	return br;
    }

}