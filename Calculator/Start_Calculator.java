import java.util.*;
public class Start_Calculator
{   
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");System.out.print("|");
        for(int i = 1;i<=20;i++)System.out.print("-");
        System.out.print("Calculator");
        for(int i = 1;i<=20;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        System.out.print("|");
        System.out.println("Press 1. Enter the Calculator                     |");
        System.out.print("|");
        System.out.println("Press 2. Exit Calculator                          |");
        System.out.print("|");
        System.out.println("Press 3. Restart Calculator                       |");
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        System.out.print("Choice: ");
        choose();
    }
    public static void choose()
    {
        Login_Calculator login = new Login_Calculator();
        Exit exit = new Exit();
        try
        {
            int a = sc.nextInt();
            if (a==1) login.Login();
            else if (a==2) exit.exit();
            else if (a==3) main(null);
            else exit.wrong_input_exit();
        }
        catch(Exception e)
        {
            System.out.println(e+"\nPlease enter a integer!!\nShutting down the Calculator....");
        }
    }
    public void restart()
    {
        main(null);
    }
}