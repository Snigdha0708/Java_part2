import java.util.*;
class a122
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ar[]=new int[4];
		for(int i=0;i<4;i++)
		{
			ar[i]=s.nextInt();
		}
		int l=0;
		int r=ar.length;
		int x=s.nextInt();
		int ans=search(ar,l,r,x);
		System.out.println(ans);
	}
	static int search(int ar[],int l,int r,int x)
	{
		while(l!=r)
		{
      int mid=(l+r)/2;
      //int res=-1;
      if(ar[mid]==x)
      {
      	return mid;
      }
      else if(ar[mid]>x)
      {
      	return search(ar,l,mid-1,x);
      }
      else if(ar[mid]<x)
      {
      	return search(ar,mid+1,r,x);
      }
      else
      {
      	return -1;
      }
  }
  return -1;
      //System.out.println(res);
	}
}