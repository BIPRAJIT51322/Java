import java.util.*;
public class Calculator
{
    public static Scanner sc = new Scanner(System.in);
    static int result;
    public static void calculator()
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
        System.out.println("Press 1. Addition                                 |");
        System.out.print("|");
        System.out.println("Press 2. Substraction                             |");
        System.out.print("|");
        System.out.println("Press 3. multiplication                           |");
        System.out.print("|");
        System.out.println("Press 4. Division                                 |");
        System.out.print("|");
        System.out.println("Press 0. Exit Calculator                          |");
        System.out.print("|");
        System.out.println("Press 10. Restart Calculator                      |");
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        Login_Calculator log = new Login_Calculator();
        System.out.println("Username: "+log.uin);
        System.out.print("Choice: ");
        select();
    }
    public static void select()
    {
        Start_Calculator srt = new Start_Calculator();
        Exit exit = new Exit();
        try
        {
            int a = sc.nextInt();
            if (a==1) add();
            else if (a==2) sub();
            else if (a==3) multiply();
            else if (a==4) divide();
            else if (a==0) exit.exit();
            else if (a==10) srt.main(null);
            else exit.wrong_input_exit();
        }
        catch(Exception e)
        {
            System.out.println(e+"\nPlease enter a integer!!\nShutting down the Calculator....");
        }
    }
    public static void add()
    {
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");System.out.print("|");
        for(int i = 1;i<=20;i++)System.out.print("-");
        System.out.print("-Addition-");
        for(int i = 1;i<=20;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        System.out.print("|");
        for(int i = 1;i<=50;i++)System.out.print("-");
        System.out.print("|");
        System.out.print("\nEnter the number of elements: ");
        try 
        {
            int a = sc.nextInt();
            int eleme [] = new int[a];
            int s = 0;
            System.out.println(" ");
            System.out.println("Enter the elements: ");
            for(int i = 0;i<a;i++)
            {
                eleme[i] = sc.nextInt();
            }
            for (int n : eleme)
            {
                s=s+n;
            }
            System.out.println("The elements are: ");
            for(int i = 0;i<a;i++)
            {
                System.out.print(eleme[i]+" ");
            }
            System.out.println("\nSum: "+s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void sub()
    {
        System.out.print("|");
        for(int i = 1;i<=49;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");System.out.print("|");
        for(int i = 1;i<=18;i++)System.out.print("-");
        System.out.print("Substraction");
        for(int i = 1;i<=19;i++)System.out.print("-");
        System.out.print("|");
        System.out.println("");
        System.out.print("|");
        for(int i = 1;i<=49;i++)System.out.print("-");
        System.out.print("|");
        System.out.print("\nEnter the number of elements: ");
        try 
        {
            int a = sc.nextInt();
            int eleme [] = new int[a];
            System.out.print("Enter the first element: ");
            int s = sc.nextInt();
            System.out.println(" ");
            System.out.println("Enter the other elements: ");
            for(int i = 0;i<a-1;i++)
            {
                eleme[i-1] = sc.nextInt();
            }
            for (int n : eleme)
            {
                int result=s-n;
            }
            System.out.println("The elements are: ");
            for(int i = 0;i<a-1;i++)
            {
                System.out.print(eleme[i]+" ");
            }
            System.out.println("\nSubstraction: "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void multiply()
    {
        System.out.println("m");
    }
    public static void divide()
    {
        System.out.println("d");
    }
}