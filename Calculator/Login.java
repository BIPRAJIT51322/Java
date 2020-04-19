import java.util.*;
import java.io.*;
public class Login
{
    public static Scanner sc = new Scanner(System.in);
    public static void login() throws IOException, InterruptedException
    {
        Exit exit = new Exit();
        Choice cho = new Choice();
        Start srt = new Start();
        System.out.print("Username: ");
        String user = sc.next();
        if (user.equals("BG")||user.equals("admin")||user.equals("Sayan@001")||user.equals("Ankan007"))
        {
              for (int t = 6;t!=0;)
                {
                System.out.print("Password: ");
                String pass = sc.next();
                if (user.equals("BG")&&pass.equals("2006"))
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    cho.Choice();
                    break;
                }
                else if (user.equals("admin")&&pass.equals("admin"))
                {
                    System.out.println("Looks like you have login with admin's account would you like to verify yourself??");
                    String verify = sc.next();
                    if (verify.equals("n0"))
                    {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        cho.Choice();
                        break;
                    }
                    else if (verify.equals("yes")||verify.equals("Yes")||verify.equals("YES"))
                    {
                        System.out.println("You are not the admin");
                        System.exit(0);
                    }
                    else if (verify.equals("0"))
                    {
                        exit.nexit();
                    }
                    else if (verify.equals("*"))
                    {
                        srt.main();
                    }
                }
                else if (user.equals("Sayan@001")&&pass.equals("2004"))
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    cho.Choice();
                    break;
                }
                else if (user.equals("Ankan007")&&pass.equals("007"))
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    cho.Choice();
                    break;
                }
                else if(pass.equals("0"))
                {
                    exit.nexit();
                }
                else if (pass.equals("*"))
                {
                    srt.main();
                }
                else 
                {
                    t--;
                    System.out.println("Chance left: "+t);
                    if (t==0)
                    {
                        exit.npexit();
                    }
                }
              }
         }
         else if(user.equals("0"))
         {
               exit.nexit();
         }
        else if (user.equals("*"))
        {
            srt.main();
        }
         else 
         {
               System.out.println("Incorrect Username. Please try again");
               login();
         }
    }
}