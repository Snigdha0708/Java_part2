import java.util.*;
class S2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
ar[i]=s.nextInt();
int large=ar[0];
int i=0;
while(i!=n)
{
if(ar[i]>large)
large=ar[i];
i++;
}
int sl=ar[0];
int j=0;
while(j!=n)
{
if(ar[j]>sl&&ar[j]<large)
sl=ar[j];
j++;
}
System.out.println(sl);
}}