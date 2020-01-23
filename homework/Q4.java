import java.util.*;
class A
{
	void a()
	{
		System.out.println("abc");
	}
}
class B extends A
{
	void a()
	{
		System.out.println("bcd");//Overriding
	}
	void b()
	{
		System.out.println("def");
	}
	void b(int n)
	{
        System.out.println("efg");//Overloading
	}
}
class Q4
{
	public static void main(String[] args) 
	{
		B bd=new B();
        bd.a();
        bd.b();
        bd.b(5);
	}
}