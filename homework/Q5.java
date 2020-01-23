import java.util.*;
 class Quadrilateral
{
	int x1,x2,x3,x4,y1,y2,y3,y4;
	int are=0;
	Quadrilateral(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
	{
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
	}
	 void area()
	 {}
}
class Trapezoid extends Quadrilateral
{
	Trapezoid(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
	{
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	void area()
	{
     are=(((x4-x1)+(x3-x2))/2)*(y2-y1);
     System.out.println("Area of trapezoid="+are);
	}
}
class Parallelogram extends Quadrilateral
{
	Parallelogram(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
	{
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	void area()
	{
     are=(x3-x2)*(y2-y1);
     System.out.println("Area of parallelogram="+are);
	}
}
class Square extends Quadrilateral
{
	Square(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
	{
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	void area()
	{
     are=(x2-x1)*(x2-x1);
     System.out.println("Area of square="+are);
	}
}
class Rectangle extends Quadrilateral
{
	Rectangle(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
	{
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	void area()
	{
     are=(x4-x1)*(y2-y1);
     System.out.println("Area of rectangle="+are);
	}
}
class Q5
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Trapezoid t=new Trapezoid(1,2,3,4,1,2,2,1);
		Parallelogram p=new Parallelogram(1,2,3,4,1,2,2,1);
		Square sq=new Square(1,2,3,4,1,2,2,1);
		Rectangle r=new Rectangle(1,2,3,4,1,2,2,1);
		t.area();
		p.area();
		sq.area();
		r.area();
	}
}