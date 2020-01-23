import java.util.*;
class A
 {
  public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int count=0;
    int b=a;
    while(b!=0)
      { 
       b=b/10;
       count++;
      }
    int ar[]=new int[count];
    int u=count-1;
      while(a!=0)
       {
        ar[u]=a%10;
        a=a/10;
        u--;
        }
   System.out.print(" ");
   for(int i=0;i<count;i++)
   {
     System.out.print(ar[i]+"  ");
   } 
  }
}