import java.util.*;
import java.io.*;
public class SI
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException
    {
        if (Login()==true)
        {
            SI();
        }
        else
        {
            Exit();
        }
    } 
    public static boolean Login() throws IOException, InterruptedException
    {
        System.out.println("Username: ");
        String a = sc.next();
        System.out.println("Password: ");
        int b = sc.nextInt();
        if (a.equals("BG")&&b==2006)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void SI() throws IOException, InterruptedException
    {
        String p = "Princial";
        String r = "Rate of Interest";
        String t = "Time";
        System.out.println("Enter the "+p+": ");
        int a = sc.nextInt();
        System.out.println("Enter the "+r+": ");
        int b = sc.nextInt();
        System.out.println("Enter the "+t+": ");
        int c = sc.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("As we know "+p+" x "+r+" x "+t+" /100 = SI");
        int si = a*b*c/100;
        System.out.println(""+a+" x "+b+" x "+c+" = "+si+"");
        System.out.println("SI: "+si);
    }
    public static void Exit()
    {
        System.out.println("Wrong username or password");
        System.exit(0);
    }
}