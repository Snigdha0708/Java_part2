import java.util.*;
class T3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String st=s.next();
		Stack<Character> a=new Stack<>();
		int flag=-1;
		String r="";
		/*for(int i=0;i<st.length();i++)
		{
			if((st.charAt(i)=='('&&st.charAt(i+1)==')')||(st.charAt(i)=='{'&&st.charAt(i+1)=='}')||(st.charAt(i)=='['&&st.charAt(i+1)==']'))
			{
				//r+=st.charAt(i);
				//r+=st.charAt(i+1);
				flag=1;
			}
			//st=st.replaceAll(r,"");
		}*/
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='('||st.charAt(i)=='{'||st.charAt(i)=='[')
				a.push(st.charAt(i));
		}
		
		for(int i=0;i<st.length();i++)
		{
			if((st.charAt(i)==')'&&a.pop()=='(')||(st.charAt(i)=='}'&&a.pop()=='{')||(st.charAt(i)==']'&&a.pop()=='['))
			{
			if(a.isEmpty())
				//System.out.println("balanced");
				flag=1;
			else
				//System.out.println("unbalanced");
				flag=0;
		}
		else 
			//System.out.println("unbalanced");
			flag=0;
		}
		if(flag==1)
			System.out.println("balanced");
				else
				System.out.println("unbalanced");
				}	
	}