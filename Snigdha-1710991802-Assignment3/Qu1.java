import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
class Qu1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[10];
		for(int i=0;i<10;i++)
			ar[i]=s.nextInt();
		try
		{
			FileWriter fw=new FileWriter("numbers.txt");
			for (int i=0;i<10;i++)
			 {
				fw.write(ar[i]);
			}
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int a1[]=new int[10];
		int b1[]=new int[1000];
		int k=0;
		try
		{
       FileReader fr=new FileReader("numbers.txt");
       int j;
       while((j=fr.read())!=-1)
        {
        	a1[k]=(char)j;
        	k++;
        }
        fr.close();
    }
    catch(Exception e)
    {
    	System.out.println();
    }
        for(int l=0;l<10;l++)
        {
        	b1[a1[l]]++;
        }
        try
        {
        FileWriter fw1=new FileWriter("result.txt");
        for(int u=0;u<10;u++)
        {
        	if(b1[a1[u]]!=0)
        	{
        		fw1.write(a1[u]+" "+b1[a1[u]]);
                 b1[a1[u]]=0;
             }
        }
        fw1.close();
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
	}
}