import java.util.*;
class Institution
{
	String name;
	String address;
	int id;
	void print()
	{
		System.out.println("Name=+"+name+" "+"Address=+"+address+" "+"Id="+id);
	}
}
class Chitkara extends Institution
{
	int nos;
	Chitkara(String n,String a,int i,int nos)
	{
     name=n;
		address=a;
		id=i;
     this.nos=nos;
	}
	void print()
	{
		System.out.println("Name=+"+name+" "+"Address=+"+address+" "+"Id="+id+"No of students="+nos);
	}
}
class stu
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		String a=in.nextLine();
		int i=in.nextInt();
		int nos=in.nextInt();
		Chitkara c=new Chitkara(n,a,i,nos);
		c.print();
	}
}