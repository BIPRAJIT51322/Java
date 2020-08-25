////We will use Scanner by importing java.util;.
import java.util.*;
//3rd program.
public class maximum_sum_of_the_subarray
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        //variable a defining the array with 10 integers.
        int[] a = new int[10];
        //for loop to take the input in the array.
        for(int i=0;i<10;i++)
        { 
            System.out.print("Enter the value "+(i+1)+": "); 
            a[i] = sc.nextInt();
        }
        //setting up the variables.
        int b = Integer.MIN_VALUE;
        int c = 0;
        int d = 0, e = 0, f = 0;
        //for loop for the calculation
        for(int i = 0;i<a.length;i++)
        {
            c = c + a[i];
            if(b<c)
            {
                b = c;
                d = f;
                e = i;
            }
            if(c<0)
            {
                c = 0;
                f = i + 1;
            }
        }
        //result
        System.out.println("The maximum sum of the sub array is "+b);
    }
}