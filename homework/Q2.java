import java.util.*;
class Q2
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			int a=n;
			int b=n;
			int ans=0;
			int r;
			int count=0;
			while(a!=0)
			{
				a=a/10;
				count++;
			}
			if(count!=5)
			{
				System.out.println("Error!!");
				n=s.nextInt();
			}
			else
			{
				while(b!=0)
				{
					r=b%10;
					ans=ans*10+r;
					b=b/10;
				}
				if(ans==n)
				{
					System.out.println("palindrome");
					n=0;
					break;
				}
				else
				{
					System.out.println("not palindrome");
					n=0;
					break;
				}
			}
		}
	}
}