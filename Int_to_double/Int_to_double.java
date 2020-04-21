import java.util.*;
public class Int_to_double
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        Double b = new Double(a);
        System.out.println(a+" is equal to " +b);
    }
}