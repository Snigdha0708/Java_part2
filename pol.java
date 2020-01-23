import java.util.*;
 abstract class Shape
{
	 abstract void calculateArea();
}
 abstract class Shape2D extends Shape
{
	 abstract void calculateArea();
	 abstract void calculatePerimeter();
}
 abstract class Shape3D extends Shape
{
	 abstract void calculateArea();
	 abstract void caculateVolume();
}
class Square extends Shape2D
{
	void calculateArea()
	{}
	void calculatePerimeter()
	{}
}
class Rectangle extends Shape2D
{
	void calculateArea()
	{}
	void calculatePerimeter()
	{}
}
class Circle extends Shape2D
{
	void calculateArea()
	{}
	void calculatePerimeter()
	{}
}
class Sphere extends Shape3D
{
	void calculateArea()
	{}
	void caculateVolume()
	{}
}
public class pol
{
     public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("0");
	}
}

