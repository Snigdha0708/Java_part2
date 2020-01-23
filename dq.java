import java.util.*;
class Deque
{
   int ar[]=new int[3];
   int l=-1;
   int r=-1;
   boolean overflow()
   {
   	if(l==0&&r==ar.length-1)
   		return true;
   	else if(l==r-1)
   		return true;
   	else
   		return false;
   }
   boolean underflow()
   {
   	if(l==-1)
   		return true;
   	else
   		return false;
   }
   void addf(int a)
   {
    if(overflow())
    	System.out.println("full");
     if (l == -1) 
        { 
            l = 0; 
            r = 0; 
        }
        else if (l == 0) 
            l = ar.length-1; 
   
        else 
           l++;
      ar[l]=a;
    }
    void addr(int a) 
    { 
        if (overflow()) 
        { 
            System.out.println(" Overflow ");  
        } 
        if (l == -1) 
        { 
            l = 0; 
            r= 0; 
        } 
        else if (r==ar.length-1) 
            r = 0; 
        else
            r = r+1; 
        ar[r] = a ; 
    } 
    void removef() 
    { 
        if (underflow()) 
        { 
            System.out.println("Empty"); 
            return;
        } 
        if (l==r) 
        { 
            l = -1; 
            r = -1; 
        } 
        else 
           { if (l == ar.length-1) 
                l = 0; 
   
            else 
                l++;
            }
    } 
    void remover() 
    { 
        if (underflow()) 
        { 
            System.out.println(" Underflow"); 
            return ; 
        } 
        if (l==r) 
        { 
            l = -1; 
            r = -1; 
        } 
        else if (r == 0) 
            r = ar.length-1; 
        else
            r--; 
    } 
    
}
class dq
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Deque d=new Deque();
		d.addf(4);
		//d.addr(5);
		//d.addr(6);
		d.addf(7);
	}
}