import java.util.*;
public class Login
{
    public static Scanner sc = new Scanner(System.in);
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
}