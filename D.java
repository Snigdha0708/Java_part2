import java.util.*;
abstract class Doctor
{
	private int id;
	String name;
	String address;
	int age;
	int salary;
	abstract int patients();
}
class Dentist extends Doctor
{
	int patients()
	{
		return 0;
	}
}
class Sur extends Doctor
{
	int patients()
	{
		return 0;
	}
}
class D
{
	public static void main(String[] args) {

	}
}