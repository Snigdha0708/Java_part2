import java.util.*;
 class M<E> 
{
  void printArray(E[] inputArray) 
  {
    for (E element : inputArray)
      System.out.print( element);

    System.out.println();
  }
}
class Qu3
{
  public static void main(String args[]) 
  {
  	Scanner s=new Scanner(System.in);
    M<Integer> m=new M<Integer>();
    M<Double>  n=new M<Double>();
    int no=s.nextInt();
    Integer[] integerArray = new Integer[no];
    for(int i=0;i<5;i++)
    	integerArray[i]=s.nextInt();
    Double[] doubleArray = new Double[no];
    for(int i=0;i<5;i++)
    	doubleArray[i]=s.nextDouble();
    Character[] characterArray = new Character[no];
    for(int i=0;i<5;i++)
    	characterArray[i]=s.next().charAt(0);
    M<Character> o=new M<Character>();
    System.out.println("Array integerArray contains:");
    m.printArray(integerArray); 
    System.out.println("\nArray doubleArray contains:");
    n.printArray(doubleArray);
    System.out.println("\nArray characterArray contains:");
    o.printArray(characterArray); 
}
}