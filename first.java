import java.util.*;
class first
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char ar[]=a.toCharArray();
		int freq[]=new int[200];
		for(int i=0;i<ar.length;i++)
			freq[ar[i]]++;
		int flag=0;
		for(int i=0;i<ar.length;i++)
		{
			if(freq[ar[i]]==1)

			{flag=1;
				System.out.println(ar[i]);
              break;
		}
	}
	if(flag!=1)
		System.out.println("-1");
	}
}