import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class validate
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String pn=s.next();
		String regex="[6-9][0-9]{9}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(pn);
		boolean mt=m.matches();
		System.out.println(mt);
	}
}