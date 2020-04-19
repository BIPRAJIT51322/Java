import java.util.*;
public class Start
{
    public static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        Login log = new Login();
        if (log.login() == true)
        {
            System.out.println("You are the owner of the program");
        }
        else 
        Exit();
    }
    public static void Exit()
    {
        System.out.println("Wrong username or password");
        System.exit(0);
    }
}