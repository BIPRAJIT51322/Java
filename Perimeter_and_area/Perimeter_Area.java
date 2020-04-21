import java.util.*;
public class Perimeter_Area
{
    public static Scanner sc  =new Scanner(System.in);
    public static void main(String[] args)
    {
        if (log() == true)
        {
            Choice();
        }
        else exit();
    }
    public static boolean log()
    {
        System.out.println("=======================================================================================");
        System.out.println("========================================Login==========================================");
        System.out.println("=======================================================================================");
        System.out.print("Username: ");
        String user = sc.next();
        System.out.print("Password: ");
        int pass = sc.nextInt();
        if (user.equals("BG")&&pass==2006)
        {
            return true;
        }
        else return false;
    }
    public static void Choice()
    {
        System.out.println("\nPress 1.Area\nPress 2.Perimeter\n");
        int a = sc.nextInt();
        if (a==1)
        {
            Area.area(null);
        }
        else if (a==2)
        {
            Perimeter.peri(null);
        }
    }
    public static void exit()
    {
        System.out.println("Wrong username or password");
        System.exit(0);
    }


}