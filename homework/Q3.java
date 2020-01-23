import java.util.*;
class Q3
{
    public static void subarray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int sum = 0;
            for (int j = i; j < a.length; j++)
            {
                sum += a[j];
                if (sum == 0) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }

    // main function
    public static void main (String[] args)
    {
        int[] a = { 1,2,3,6,-12,4 };

        subarray(a);
    }
}