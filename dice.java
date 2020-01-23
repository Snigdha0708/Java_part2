import java.util.*;
import java.util.Random;
class Rendom
{
	int value;
	Rendom(int value)
	{
		this.value=value;
	}
	int add(Rendom r2)
	{
		this.value=this.value+r2.value;
		return this.value;
	}
}
class dice
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum[]=new int[2000];
		Random ren=new Random();
        for(int i=0;i<2000;i++)
        {
		Rendom r1=new Rendom(ren.nextInt(6)+1);
		Rendom r2=new Rendom(ren.nextInt(6)+1);
		sum[i]=r1.add(r2);
	    }
	    int freq[]=new int[13];
	    for(int i=0;i<2000;i++)
	    {
	    	freq[sum[i]]++;
	    }
	    for(int i=0;i<2000;i++)
	    {
	    	if(freq[sum[i]]!=-1)
	    	{
	    	System.out.println(sum[i]+" "+freq[sum[i]]);
	    	freq[sum[i]]=-1;
	    }
	    }
}
}