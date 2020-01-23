
import java.util.*;
//import java.util.Stack;
class Qu4
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.replaceAll("[\\W]","");
		a=a.replaceAll(" ","");
		//System.out.println(a);
		char[] ar=a.toCharArray();
		int size=ar.length;
		Stack<Character>st=new Stack<>();
		for(int i=0;i<ar.length;i++)
		st.push(ar[i]);
		int flag=-1;
		for(int i=0;i<ar.length;i++)
		{
		    char b=st.pop();
		    if(a.charAt(i)==b)
		    flag=1;
		    else
		    {
		        flag=0;
		        break;
		    }
		}
		if(flag==1)
		System.out.println("pallindrome");
		else
		System.out.println("not pallindrome");
	}
}