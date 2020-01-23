import java.util.*;
class Car
{
	int speed;
	int fuel;
	String color;
	String state;
 void setSpeed(int s)
 {
 	speed=s;
 }
 int getSpeed()
 {
 	return speed;
 }
 void setFuel(int f)
 {
 	fuel=f;
 }
 int getFuel()
 {
 	return fuel;
 }
 void setColor(String c)
 {
 	color=c;
 }
 String getColor()
 {
 	return color;
 }
 void setState(String st)
 {
 	state=st;
 }
 String getState()
 {
 	return state;
 }
}
class Maruti extends Car
{

}
class Honda extends Car
{

}
class J5
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Car c=new Car();
		c.setSpeed(100);
		c.setFuel(98);
		c.setColor("Black");
		c.setState("ON");
	}
}