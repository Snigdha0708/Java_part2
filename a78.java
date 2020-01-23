class A throws Exception
{
int a;
try
{
	if(a>0)
		throw ("abc");
	else
		throw("def");
}
catch(Exception e)
{
	System.out.println(e);
}
}
class B extends A
{

}
class a78
{
	public static void main(String[] args) 
	{
		B b=new B();
	}
}