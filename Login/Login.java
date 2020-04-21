import java.util.*;
public class Login 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String a = "Lets see if you have permission from the Owner";
        System.out.println(a);  
        if (login()==true) 
        {
            System.out.print("You are verified!!");
        }
        else if (login()==false) 
        {
            System.out.println("You are not verified!!");
        }
    }
    public static boolean login()
    {
        System.out.print("Username: ");
        String user = sc.next();
        if (user.equals("BG")||user.equals("admin")||user.equals("Sayan@001"))
        {
            System.out.print("Password: ");
            String pass = sc.next();
            if (user.equals("BG")&&pass.equals("2006")||user.equals("Sayan@001")&&pass.equals("2004"))
            { 
                return true;
                 
                
            }
            else 
            {
                return false;
                
            }
        }
        else 
        {
            System.out.println("Wrong username");
            return false;
        }
    }
}