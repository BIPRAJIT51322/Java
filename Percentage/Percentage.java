import java.util.*;
public class Percentage
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
            Result();
        }
        else 
        {
            Exit();
        }
    }
  public static void Result()
    {
        System.out.print("Enter the amount out of total: ");
        double a = sc.nextDouble();
        System.out.print("Enter the total amount: ");
        double b = sc.nextDouble();
        double c = b/a*100d;
        System.out.println("Percentage: "+c+" %");
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