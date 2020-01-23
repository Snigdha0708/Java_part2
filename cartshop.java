import java.util.*;
class product
{
	String name;
	int price;
	int id;
	product(String n,int p,int i)
	{
		name=n;
		price=p;
		id=i;
	}
}
class cart extends product
{
	HashMap<Integer,Integer> ct=new HashMap<Integer,Integer>();
	int qty;
	int v;
	cart(String n,int p,int i,int qty)
	{
		super(n,p,i);
        this.qty=qty;
	}
	void add()
	{
      ct.put(id,qty);
	}
	void remove(int id,int qu)
	{
      v=ct.get(id);
      v=v-qu;
      ct.replace(id,v);
	}
}
class bill extends cart
{
	static int bill=0;
	static float f=0;
	float tf=0;
    float tax;
    bill(String n,int p,int i,int qty)
    {
    	super(n,p,i,qty);
    	tax=5;
    	    }
    void total1()
    {
    	bill+=ct.get(id)*price;
    }
    void total()
    {
    	System.out.println("Total Bill="+bill);
    }
    void withTax()
    {
      tf=(float)((float)bill*(tax/100));
      System.out.println(tf);
      f+=(float)bill+tf;
      System.out.println("To be paid="+f);
    }
}
class cartshop
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		bill b=new bill("Top",200,123,2);
		bill c=new bill("T-shirt",300,122,3);
		b.add();
		//b.remove(123,1);
		b.total1();
		b.withTax();

		c.add();
		//c.remove(123,1);
		c.total1();
		c.withTax();
		c.total();
	}
}