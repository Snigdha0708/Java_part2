import java.util.*;
class pro
{
	int id;
	String name;
	float price;
  String type;
  String cat;
	pro(int id,String name,float price,String t,String c)
	{
      this.id=id;
      this.name=name;
      this.price=price;
      type=t;
      cat=c;
	}
}
class cart 
{
	Scanner s=new Scanner(System.in);
	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
  float price;
  String t;
  String cat;
	void add(int a, int qty)
	{
      	if(mp.containsKey(a))
      	{
      		qty++;
      	}
      	else 
      	{
           mp.put(a,qty);
           price=s.nextFloat();
           t=s.next();
           cat=s.next();
           pro pr=new pro(a,s.next(),price,t,cat);
      	}
      }
      void remove(int a,int qty)
      {
      	int abc=mp.get(a);
      	if(abc>=qty)
      	{
      		if(abc==qty)
      			mp.remove(a);
      		else
      			mp.put(a,abc);
      	}
      	else
      	{
      		System.out.println("Error!");
      	}
      }
      void total()
      {
      	 float total=0;
      	 float ftotal=0;
        int ar[]=new int [mp.size()];
        Set<Integer> keys=mp.keySet();
        for(int i=0;i<ar.length;i++)
        {
        for(int key:keys)
        	ar[i]=key;
      }
      for(int i=0;i<ar.length;i++)
      {
        total+=price*mp.get(ar[i]);
        System.out.println(total);
      }
      if(t.equalsIgnoreCase("Organic"))
      {ftotal+=((total*0.05)*2)+total;}
      if(t.equalsIgnoreCase("Luxury"))
          ftotal+=((total*0.15)*2)+total;
          else
                ftotal+=((total*0.1)*2)+total;
      System.out.println(ftotal);
  }
  void exchange()
  {
    if(cat.equals("food"))
      System.out.println("RETURN IN ONE DAY");
    if(cat.equals("Electronics"))
      System.out.println("RETURN IN 30 DAYS");
    else
      System.out.println("RETURN IN FIFTEEN DAYS");
  }
	}
class Que1
{
	public static void main(String[] args) 
	{
		cart ct=new cart();
		ct.add(171,2);
		ct.remove(171,1);
		ct.total();
	}
}