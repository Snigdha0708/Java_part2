import java.util.*;
class Employee
{
 String name[]=new String[3];
 int year[]=new int[3];
 int salary[]=new int[3];
 String address[]=new String[3];
 static int count=0;
 void get()
 {
   Scanner in=new Scanner(System.in);
   count++;
   for(int i=0;i<3;i++)
   {
   name[i]=in.next();
   year[i]=in.nextInt();
   salary[i]=in.nextInt();
   address[i]=in.next();
   }
 }
 void print()
  {
   for(int i=0;i<3;i++)
   { 
    System.out.print(name[i]+"     "+year[i]+"     "+address[i]);
    System.out.println();
   }
   System.out.println("Number of Instances="+count);
 }
}
class ABC
{
  public static void main(String args[])
   {
    Employee e=new Employee();
    Employee f=new Employee();
    f.get();
    e.get();
    System.out.println("Name"+"     "+"Year"+"     "+"Address");
    e.print();
    f.print();
    }
 }
          