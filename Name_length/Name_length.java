import java.util.*;
public class Name_length 
{
    static String mn;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter your first name: ");
        String fn = sc.next();
        System.out.println("Do you have a middle name.\nPress 1. Yes\nPress any other number to No");
        int a = sc.nextInt();
        if (a==1) 
        {
            System.out.println("Enter your middle name(if exist): ");
            mn = sc.next();
        }
        System.out.println("Enter your last name: ");
        String ln = sc.next();
        System.out.println("The length of your first name is "+fn.length());
        if (mn!=null) 
        {
            System.out.println("The length of your first name is "+mn.length());
        }
        System.out.println("The length of your first name is "+ln.length());
    }
}