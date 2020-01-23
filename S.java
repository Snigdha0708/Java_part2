import java.util.*;
class S
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
ar[i]=s.nextInt();
for(int i=0;i<n;i++)
for(int j=0;j<n-i-1;j++)
if(ar[j]<ar[j+1])
{
int temp=ar[j];
ar[j]=ar[j+1];
ar[j+1]=temp;
}
System.out.println(ar[1]);
}}