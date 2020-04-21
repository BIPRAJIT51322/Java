import java.util.*;
public class Double_to_int
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        double a = sc.nextDouble();
        int b = (int) Math.round(a);
        if (a==b)
        {
            System.out.println(a+" is equal to "+b);
        }
        else
        {
            System.out.println(a+" is approx to "+b);
        }
    }
}