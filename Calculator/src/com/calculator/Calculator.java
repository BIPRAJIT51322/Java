package com.calculator;
import java.io.IOException;
import java.util.*;
public class Calculator
{
    public static Scanner sc = new Scanner(System.in);
    static Login log = new Login();
    static Start srt = new Start();
    static Basic basic = new Basic();
    static Exit exit = new Exit();
    static SI si = new SI();
    static Perimeter perimeter = new Perimeter();
    static Area area = new Area();
    public static void calculator()
    {
        try {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------------Calculator--------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. Addition                                 |");
            System.out.println("|Press 2. Subtraction                              |");
            System.out.println("|Press 3. Multiplication                           |");
            System.out.println("|Press 4. Division                                 |");
            System.out.println("|Press 5. Multiplication table                     |");
            System.out.println("|Press 6. Simple Interest(SI)                      |");
            System.out.println("|Press 7. Area                                     |");
            System.out.println("|Press 8. Perimeter                                |");
            System.out.println("|Press 0. Exit Calculator                          |");
            System.out.println("|Press 10. Restart Calculator                      |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("Choice: ");
            select();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void select()
    {
        try
        {
            int a = sc.nextInt();
            if (a==1) basic.add();
            else if (a==2) basic.sub();
            else if (a==3) basic.multiply();
            else if (a==4) basic.divide();
            else if (a==5) basic.table();
            else if (a==6) si.select();
            else if (a==7) area.area();
            else if (a==8) perimeter.perimeter();
            else if (a==0) exit.exit();
            else if (a==10) srt.design();
            else exit.wrong_input_exit();
        }
        catch(Exception e)
        {
            System.out.println(e+"\nPlease enter a integer!!\nShutting down the Calculator....");
        }
    }
    public static void more()throws IOException
    {
        try {
            Exit exit = new Exit();
            System.out.println("Want to do something more???(Yes/No)");
            String a = sc.next();
            if (a.equals("Yes") || a.equals("yes") || a.equals("YES") || a.equals("yEs")) calculator();
            else if (a.equals("yeS") || a.equals("yES") || a.equals("YeS") || a.equals("YEs")) calculator();
            else if (a.equals("NO") || a.equals("No") || a.equals("no") || a.equals("nO")) exit.exit();
            else exit.wrong_input_exit();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
