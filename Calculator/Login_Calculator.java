import java.util.*;
public class Login_Calculator 
{
    static String[] user = {"BG", "Sayan@001", "admin"}; 
    static int[] pin = {2006, 2004, 00000};
    static String uin;
    public static Scanner sc = new Scanner(System.in);
    public static void Login() 
    {
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");System.out.print("|");
        for(int i = 1;i<=20;i++)System.out.print("-");
        System.out.print("---Login--");
        for(int i = 1;i<=20;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        username();
    }
    public static void username()
    {
        Exit exit = new Exit();
        int t = 6;
        System.out.print("Username: ");
        uin = sc.next();
        if (uin.equals(user[0])||uin.equals(user[1])||uin.equals(user[2]))
        {
             System.out.println("USERNAME: "+uin);
          try
         {
            for (int i=1;i<=7;i++)
         {
            System.out.print("Pin: ");
            int pinn = sc.nextInt();
            if (uin.equals(user[0])&&pinn==pin[0]||uin.equals(user[1])&&pinn==pin[1]||uin.equals(user[2])&&pinn==pin[2])
            {
                Calculator calc = new Calculator();
                calc.calculator();
                break;
            }
            else 
            {
                System.out.println("Wrong pin!!");
                t--; 
                if (t==0) 
                {
                    exit.wrong();
                }
            }
        }
        }catch (Exception e) {System.out.println("Please enter a pin that is in integer form!!!\nShutting down Calculator!!!");}
        }
        else 
        {
            System.out.println("Incorrect Username Pls try again!!");
            username();
        }
    }
}