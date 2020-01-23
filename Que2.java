import java.util.*;
class Category
{
   String name;
   int count=0;
   Category(String n)
   {
   	name=n;
   	count++;
   }  
}
class SubCategory extends Category
{
String name1;
SubCategory(String n,String n1)
{
	super(n);
	name1=n1;
	count++;
}
}
class Pro extends SubCategory
{
String name2;
Pro(String n,String n1,String n2)
{
	super(n,n1);
	name2=n2;
	count++;
}
}
class filter extends Pro
{
	//String c;
	List<String> li=new ArrayList<String>();
	filter(String n,String n1,String n2,String c)
	{   
		super(n,n1,n2);
		li.add(c);
		count++;
	}
	void add1(String na)
	{
     li.add(na);
     System.out.println(li);
	}
}
class Que2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Pro p=new Pro("clothing","men","tshirt");
		 System.out.println(p.count);
       filter f=new filter("clothing","men","tshirt","blue");
       System.out.println(f.count);
       f.add1("red");
	}
}
