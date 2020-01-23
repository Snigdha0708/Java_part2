import java.util.*;
class Stack
{
  Character ar1[]=new Character[100];
  int i=0;
  int flag=-1;
  char d;
  void push(char a)
  { 
   
    ar1[i]=a;
    i++;
  }
  int size()
  {
  	return i;
  }
  char peek()
  {
  	return (ar1[i-1]);
  }
boolean isEmpty()
{
	if(ar1[0]==null)
		return true;
	else
		return false;
}
char pop()
{
	
	d=ar1[i-1];
	ar1[i-1]=null;
	i=i-1;
	return d;
}
int search(char a)
{
  for(int i=0;i<ar1.length;i++)
  {
  	if(ar1[i]==a)
     {
     	flag=(100-i);
     	break;
     }
}
return flag;
}}
class atos
{
	public static void main(String[] args)
	 {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Character ar[]=new Character[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=s.next().charAt(0);
		}
		Stack st=new Stack();
		for(int i=0;i<n;i++)
        st.push(ar[i]);
        char a1=st.peek();
        System.out.println(a1);
        int si=st.size();
        System.out.println(si);
        char a2=st.pop();
        System.out.println(a2);
        boolean ans=st.isEmpty();
        System.out.println(ans);
        char find=s.next().charAt(0);
        int se=st.search(find);
        System.out.println(se);
    }
}