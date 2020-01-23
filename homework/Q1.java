import java.util.*;
class Q1
{
	public static void main(String[] args) 
	{   
		int j;
		for(j=1;j<=10;j++)
		{
			if(j%2!=0)
			{
				for(int i=0;i<5;i++)
				{
					System.out.print("* ");
				}
				for(int k=0;k<20;k++)
				{
					System.out.print("=");
				}
			}
			else
			{
				for(int i=0;i<4;i++)
					System.out.print(" *");
				System.out.print("  ");
				for(int k=0;k<20;k++)
				{
					System.out.print("=");
				}
			}
			System.out.println();
		}
		for(j=11;j<=16;j++)
		{
			for(int k=0;k<30;k++)
			{
				System.out.print("=");
			}
			System.out.println();
		}
	}
}