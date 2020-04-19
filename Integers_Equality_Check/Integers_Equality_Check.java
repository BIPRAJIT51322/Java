import java.util.*;
public class Integers_Equality_Check
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Username: ");
        String a = sc.next();
        System.out.print("Password: ");
        String b = sc.next();
        System.out.println("");
        if (a.equals("BG")&&b.equals("2006"))
        {
            System.out.println("Welcome Biprajit Ghosh");
            Calc();
        }
        else 
        {
            Exit();
        }
    }
    public static void Calc()
    {
        System.out.println("First Number: ");
        int a = sc.nextInt();
        System.out.println("Second Number: ");
        int b = sc.nextInt();
        System.out.println("Thrird Number: ");
        int c = sc.nextInt();
        System.out.println("Forth Number: ");
        int d = sc.nextInt();
        if (a==b&&b==c&&c==d&&d==a)
        {
            System.out.println("The number are equal.");
        }
        else
        {
            System.out.println("The numbers are not equal");            
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