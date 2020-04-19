import java.util.*;
public class Login
{
    public static Scanner sc = new Scanner(System.in);
     public static boolean login()
    {
        Start srt = new Start();
        System.out.println("Username: ");
        String a = sc.next();
        System.out.println("Password: ");
        int b = sc.nextInt();
        if (a.equals("BG")&&b==2006)
        {
           return true;
        }
        else return false;
    }
}