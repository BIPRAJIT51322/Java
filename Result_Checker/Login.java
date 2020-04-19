import java.util.*;
import java.io.*;
public class Login
{
    public static Scanner sc = new Scanner(System.in);
    public static boolean login() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("---------------------------------------");
        System.out.println("------------------Login----------------");
        System.out.println("---------------------------------------");
        System.out.print("Username: ");
        String a = sc.next();
        System.out.print("Password: ");
        int b = sc.nextInt();
        if (a.equals("BG")&&b==2006||a.equals("Sayan@001")&&b==2004||a.equals("ankanpal007")&&b==2004) 
        {
            return true;
        }    
        else 
        {
            return false;
        }
    }
}