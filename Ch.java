import java.util.*;
class Complex
{
  int r1,r2,c1,c2;
  Complex(int a,int b,int c,int d)
   {
     r1=a;
     r2=c;
     c1=b;
    c2=d;
   } 
  void add()
   {
    System.out.println("SUM="+(r1+r2)+" +"+(c1+c2)+"i");
   }
  void diff()
   {
   if(r1>r2)
    System.out.println("DIFF="+(r1-r2)+"+ "+(c1-c2)+"i");
   else
    System.out.println("DIFF="+(r2-r1)+" +"+(c2-c1)+"i");
   }
  void prod()
   {
    System.out.println("PROD="+((r1*r2)+(c1*c2*-1))+"+"+((r1*c2)+(r2*c1))+"i");
   }
}
class Ch
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int a,b,c,d;
  a=s.nextInt();
  b=s.nextInt();
  c=s.nextInt();
  d=s.nextInt();
  Complex ob=new Complex(a,b,c,d);
  ob.add();
  ob.diff();
  ob.prod();
 }
}
