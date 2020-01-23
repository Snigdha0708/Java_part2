import java.util.*;
class T2
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.replaceAll(" ","");
		char b[]=a.toCharArray();
		int ar[]=new int[200];
		for(int i=0;i<b.length;i++)
		{
			ar[b[i]]++;
		}
		for(int i=0;i<b.length;i++)
		{
			if(ar[b[i]]!=0)
			{
				System.out.println("Frequency of "+b[i]+"="+ar[b[i]]);
				ar[b[i]]=0;
			}
		}
	}
}