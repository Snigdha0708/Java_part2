import java.util.*;
public class LL
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d);
		{
			data=d;
		}
	}
public static LL insert(LL l,int d)
{
	Node newnode=new Node(d);
	newnode.next=null;
	if(l.head==null)
		l.head=newnode;
	else
		Node ptr=l.head;
	while(ptr.next)
	{
		ptr=ptr.next;
	}
	pt.next=newnode;
}
public static void printList(LL l)
{
	Node ptr=l.head;
	while (ptr.next!=null) {
		System.out.println(ptr.data);
		ptr=ptr.next;
	}

}
}
class ll
{
	public static void main(String[] args) 
	{
		LL abc=new LL();
		insert(abc,30);
		printlList(abc);
	}
}




