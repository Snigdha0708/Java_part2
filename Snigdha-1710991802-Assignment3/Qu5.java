import java.util.*;
class ListConactenate
{
	static List<Character> li=new ArrayList<Character>();
	static void conact(List<Character>l1,List<Character>l2)
	{
		li.addAll(l1);
		li.addAll(l2);
		Iterator i=li.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		//System.out.println(li);
	}
}
class Qu5
{
	public static void main(String[] args)
	 {
	 	Scanner s=new Scanner(System.in);
           String a=s.next();
           String b=s.next();
           char[] a1=a.toCharArray();
           char[] b1=b.toCharArray();
		List<Character>l1=new ArrayList<Character>();
		List<Character>l2=new ArrayList<Character>();
		for(int i=0;i<a1.length;i++)
			l1.add(a1[i]);
		for(int i=0;i<b1.length;i++)
			l2.add(b1[i]);
		ListConactenate lc=new ListConactenate();
		lc.conact(l1,l2);
	}
}