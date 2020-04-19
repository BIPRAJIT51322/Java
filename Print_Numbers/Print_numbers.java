import java.util.*;

public class Print_numbers 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Note*: This program can crash your PC. Any damage occured in your PC, we will not be responsible for that.");
        System.out.print("Username: ");
        String a = sc.next();
        System.out.print("Password: ");
        String b = sc.next();
        System.out.println("");
        if (a.equals("BG")&&b.equals("2006"))
        {
            System.out.println("Welcome Biprajit Ghosh");
            Option();
        }
        else 
        {
            Exit();
        }
    }
    public static void Option()
    {
        System.out.println("\nPress 1 to print limit numbers\nPress 2 to print infinite numbers");
        int a = sc.nextInt();
        if (a == 1)
        {
            Limit();
        }
        if (a == 2)
        {
            Infinite();
        }
    }
    public static void Infinite()
    {
        int a=1;
        while (0<a)
        {
            a++;
            System.out.println(a);
        }
    }
    public static void Limit()
    {
        System.out.print("Starting number: ");
        int a=sc.nextInt();
        System.out.print("Finishing number: ");
        int b = sc.nextInt();
        System.out.println(a);
        while (a<b)
        {
            a++;
            System.out.println(a);
        }
    }
    public static void Exit()
    {
        System.out.println("System % boot installed%");
        System.out.println("%AppData B-spyware by BG installed%");
        System.out.println("%new% %password*% &set&: 21062006");
        System.out.println("a = new(MUTANTPROGRAMMERS/%ipaddress%/%PC user%)");
        System.out.println("Send pc data to ip%bg.github.a%");
        System.out.println("You are hacked by Biprajit Ghosh");
        System.exit(0);
    }
}