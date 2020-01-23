import java.util.*;
class Player{
 String name;
 int score;
 Player(String name, int score){
 this.name = name;
 this.score = score;
 }
 public String getName()
 {
return name;
 }
 public int getScore()
 {
return score;
 }
 public String toString()
 {
String v;
v=this.name+" "+" "+this.score;
return v;
 }
}
class Checker implements Comparator<Player>
{
public int compare(Player e,Player o)
{
int result;
result=o.getScore()-e.getScore();
if(result==0)
{
result=e.getName().compareTo(o.getName());
return result;
}
else
return result;
}
}
class T4
{
public static void main(String args[])
{
List<Player> l=new ArrayList<Player>();
Scanner s=new Scanner(System.in);
int n;
String nam;
int sco;
n=s.nextInt();
Player a[]=new Player[n];
for(int i=0;i<n;i++)
{
nam=s.nextLine();
s.nextLine();
sco=s.nextInt();
a[i]=new Player(nam,sco);
l.add(a[i]);
}

Collections.sort(l,new Checker());
for(int j=0;j<l.size();j++)
{
System.out.println(l.get(j));
}



}
}