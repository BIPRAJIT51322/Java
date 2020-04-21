import java.util.*;

public class Multiplcation_table
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        double number = sc.nextDouble();
        for(int a = 1;a<=10;a++)
        {
            System.out.println(number+" x "+a+" = "+(number*a));
        }
    }
}