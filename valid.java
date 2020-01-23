import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
class valid
{
	public static void main(String[] args) 
	{
		int count=0;
		try
		{
		FileReader fr=new FileReader("input.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			count++;
		}
		System.out.println(count);
		char ar[]=new char[count];
		int k;
		FileReader fa=new FileReader("input.txt");
		int j=0;
			while((k=fa.read())!=-1)
			{
				ar[j]=(char)k;
				j++;
			}
		//for(int l=0;l<count;l++)
			//System.out.print(ar[l]);
			int flag=-1;
			int v=0;
      for(int u=0;u<count;u++)
      {
      	if(ar[u]>='0'&&ar[u]<='9')
      		flag=1;
      }
     if(count==10)
     {
     	if(ar[0]>='7'&&ar[0]<='9')
         v=1;
     }
     else if(count==11)
     {
     	if(ar[0]=='0'&&(ar[1]>='7'&&ar[1]<='9'))
     		v=1;
     }
     else if(count==12)
     {
     	if((ar[0]=='9'&&ar[1]=='1')&&(ar[2]>='7'&&ar[2]<='9'))
     		v=1;
     }
     else
     	v=0;
     String answer="";
     if(v==1)
     {
      for(int an=0;an<count;an++)
      	answer+=ar[an];
     }
     System.out.println(answer);
     FileWriter fw=new FileWriter("output.txt");
     fw.write(answer);
     fw.close();
	}
	catch(Exception e)
	{
		System.out.println("");
	}
	}
}