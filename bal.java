import java.util.*;
class bal
{
	public static void main(String[] args)
	 {
		Scanner s=new Scanner(System.in);
        String in=s.next();
        char ar[]=in.toCharArray();
        Stack st=new Stack();
        for(int i=0;i<in.length();i++)
        {
        	if(ar[i]=='('||ar[i]=='{'||ar[i]=='[')
        		st.push(ar[i]);
        }
        for(int i=0;i<in.length();i++)
        {
        	if((ar[i]==')'&&st.peek()=='(')||(ar[i]=='}'&&st.peek()=='{')||(ar[i]==']'&&st.peek()=='['))
        		st.pop();
        }
        	if(st.isEmpty())
        		System.out.println("Balanced");
        	else
        		System.out.println("Not Balanced");
	}
}