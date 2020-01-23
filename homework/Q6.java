import java.util.*;
import java.util.Random;
class GuessGame
{
	String p1,p2,p3;
	int r1,r2,r3;
	String win;
	Scanner s=new Scanner(System.in);
	void n()
	{

		p1=s.next();
		p2=s.next();
		p3=s.next();
	}
	void in()
	{

		r1=s.nextInt();
		r2=s.nextInt();
		r3=s.nextInt();
	}
    String startGame(int f)
    {
    	while(win==null)
    	{
    	if(r1==f||r2==f||r3==f)
    	{
    		if(r1==f)
    			win=p1;
    		else if(r2==f)
    			win=p2;
    		else
    			win=p3;
    	}
    	else
    	{
    		in();
    	}
    }
    return win;
}
}
class Q6//Game Launcher
{
	public static void main(String[] args) {
		
		GuessGame g=new GuessGame();
		g.n();
		g.in();
		Random r=new Random();
		String ans=g.startGame(r.nextInt(9)+1);
		System.out.println("Winner is="+ans);
	}
}