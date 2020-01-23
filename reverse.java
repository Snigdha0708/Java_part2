import java.util.*;
class reverse
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		StringBuffer sb=new StringBuffer(a);
		String res=sb.reverse().toString();
		//System.out.println(res);
		String ar[]=res.split("\\.");
		String res1="";
		for(int i=0;i<ar.length;i++)
			{
				StringBuffer sb1=new StringBuffer(ar[i]);
				String r=sb1.reverse().toString();
                res1+=r+".";
			}
			String res2=res1.substring(0,res1.length()-1);
			System.out.println(res2);
		}}