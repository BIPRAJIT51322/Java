package com.calculator;
import java.io.IOException;
import java.util.*;
public class SI
{
    public static Scanner sc = new Scanner(System.in);
    static Calculator calc = new Calculator();
    static Exit exit = new Exit();
    static Start start = new Start();
    public static void select()
    {
        try {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|-----------------Simple-Interest------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. Find Interest                            |");
            System.out.println("|Press 2. Find Principal                           |");
            System.out.println("|Press 3. Find Rate of Interest                    |");
            System.out.println("|Press 4. Find Time                                |");
            System.out.println("|Press 5. Find Annual                              |");
            System.out.println("|Press 6. Restart Calculator                       |");
            System.out.println("|Press 7. Exit                                     |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("\nChoice: ");
            choice();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void choice()
    {
        try
        {
            int a = sc.nextInt();
            if (a==1) si();
            else if (a==2) principal();
            else if (a==3) rate();
            else if (a==4) time();
            else if (a==5) annual();
            else if (a==6) start.design();
            else if (a==7) exit.wrong_input_exit();
            else choice();
        }
        catch (Exception e)
        {
            System.out.println("Please follow the instructions given by the calculator!!");
        }
    }
    public static void si()throws IOException
    {
        try {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------------Interest----------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. If you have Principal, Rate of Interest  |");
            System.out.println("|and Time                                          |");
            System.out.println("|Press 2. If you have Principal amount             |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Principal: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Rate of Interest");
                Double b = sc.nextDouble();
                System.out.println("Enter the Time: ");
                Double c = sc.nextDouble();
                Double si = a * b * c / 100d;
                System.out.println("Simple Interest: " + si);
                calc.more();
            } else if (choice == 2) {
                System.out.println("Enter the Principal: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Amount: ");
                Double b = sc.nextDouble();
                Double si = b - a;
                System.out.println("Simple Interest: " + si);
                calc.more();
            } else {
                System.out.println("Please follow the instructions given by the calculator!!");
                si();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void principal()throws IOException {
        try {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------------Principal---------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. If you have Interest, Rate of Interest   |");
            System.out.println("|and Time                                          |");
            System.out.println("|Press 2. If you have Interest and Amount          |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Interest: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Rate of Interest: ");
                Double b = sc.nextDouble();
                System.out.println("Enter the Time: ");
                Double c = sc.nextDouble();
                Double p = a * 100 / b * c;
                System.out.println("Principal: " + p);
                calc.more();
            } else if (choice == 2) {
                System.out.println("Enter the Simple Interest: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Annual: ");
                Double b = sc.nextDouble();
                Double p = b - a;
                System.out.println("Principal: " + p);
                calc.more();
            } else {
                System.out.println("Please follow the instructions given by the calculator!!");
                principal();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void rate()throws IOException
    {
        try {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------------Principal---------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. If you have Interest, Principal and Time |");
            System.out.println("|Press 2. If you have Amount, Principal, Time      |");
            System.out.println("|Press 3. If you have Amount, Interest, Time       |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Interest: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Principal");
                Double b = sc.nextDouble();
                System.out.println("Enter the Time: ");
                Double c = sc.nextDouble();
                Double r = a * 100 / b * c;
                System.out.println("Rate of Interest: " + r);
                calc.more();
            } else if (choice == 2) {
                System.out.println("Enter the Amount: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Principal");
                Double b = sc.nextDouble();
                System.out.println("Enter the Time: ");
                Double c = sc.nextDouble();
                Double i = a - b;
                Double r = i * 100 / b * c;
                System.out.println("Rate of Interest: " + r);
                calc.more();
            } else if (choice == 3) {
                System.out.println("Enter the Amount: ");
                Double a = sc.nextDouble();
                System.out.println("Enter the Interest");
                Double b = sc.nextDouble();
                System.out.println("Enter the Time: ");
                Double c = sc.nextDouble();
                Double r = b * 100 / (a - b) * c;
                System.out.println("Rate of Interest: " + r);
                calc.more();
            } else {
                System.out.println("Please follow the instructions given by the calculator!!");
                rate();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void time()throws IOException
    {
        try {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------------Principal---------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. If you have Interest, Principal and Rate |");
            System.out.println("|of Interest                                       |");
            System.out.println("|Press 2. If you have Amount, Principal, Rate of   |");
            System.out.println("|Interest                                          |");
            System.out.println("|Press 3. If you have Amount, Interest, Rate of    |");
            System.out.println("|Interest                                          |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("Enter the Simple Interest: ");
            Double a = sc.nextDouble();
            System.out.println("Enter the Principal");
            Double b = sc.nextDouble();
            System.out.println("Enter the Rate of Interest: ");
            Double c = sc.nextDouble();
            Double t = a * 100 / b * c;
            System.out.println("Rate of Time: " + t);
            calc.more();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void annual()
    {
        try
        {

        }
        catch (Exception e)
        {

        }
    }
}