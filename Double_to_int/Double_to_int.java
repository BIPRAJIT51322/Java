import java.util.*;
import java.math.*;
public class Double_to_int
{
    public static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        System.out.print("Enter the number: ");
        double a = sc.nextDouble();
        int b = (int) Math.round(a);
        System.out.println(a+" is approx to "+b);
    }
}