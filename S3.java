import java.util.*;
class S3
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
do
{
if(ar[i]>large)
large=ar[i];
i++;
}
while(i!=n);
int sl=ar[0];
int j=0;
do
{
if(ar[j]>sl&&ar[j]<large)
sl=ar[j];
j++;
}while(j!=n);
System.out.println(sl);
}}