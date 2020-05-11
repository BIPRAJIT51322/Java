package com.calculator;
import java.awt.*;
import java.io.*;
import java.util.*;
public class Login
{
    public static Scanner sc = new Scanner(System.in);
    static Exit exit = new Exit();
    static Start start = new Start();
    static Calculator calc = new Calculator();
    static String userin, passin;
    static String Name, LName;
    static Properties properties = new Properties();
    static String firstname, lastname, username, password;
    public static void Login() throws IOException
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|-----------------------Login----------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. Login                                    |");
            System.out.println("|Press 2. Register                                 |");
            System.out.println("|Press 3. Exit Calculator                          |");
            System.out.println("|Press 4. Restart Calculator                       |");
            System.out.println("|--------------------------------------------------|");
            test();
        }
        catch(Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
    public static void test()throws IOException
    {
        try {
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) Signindesign();
            else if (choice == 2) Signupdesign();
            else if (choice == 3) exit.exit();
            else if (choice == 4) start.design();
            else {
                System.out.println("Please follow the instructions given by the calculator!!!");
                test();
            }
        }
        catch (Exception e)
        {
            System.out.println("Please enter a integer not a letter, alphabet or a symbol. Please restart the Calculator!!!!");
            System.out.println("Shutting down Calculator..../n");
        }
    }
    public static void Signindesign()
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|-----------------------Login----------------------|");
            System.out.println("|You can press 0 in the username to go back        |");
            System.out.println("|--------------------------------------------------|");
            Signin();

        }
        catch (Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
    public static void Signupdesign()
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|---------------------Register---------------------|");
            System.out.println("|--------------------------------------------------|");
            Signup();
        }
        catch (Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
    public static void Signin() throws IOException
    {
        FileInputStream filein = new FileInputStream("Calculator.properties");
        properties.load(filein);
        Name = properties.getProperty("FirstName");
        LName = properties.getProperty("LastName");
        System.out.println("Username: ");
        userin = sc.next();
        if(userin.equals(properties.getProperty("Username")))
        {
            for (int i=0;i<6;i++)
            {
                System.out.println("Password: ");
                passin = sc.next();
                if (userin.equals(properties.getProperty("Username"))&&passin.equals(properties.getProperty("Password")))
                {
                    calc.calculator();
                    break;
                }
                else
                {
                    int t = 6; t--;
                    System.out.println("Chances left to enter password: "+t);
                    if (t==0) exit.wrong();
                }
            }
        }
        else if (userin.equals("0")) Login();
        else
        {
            System.out.println("Incorrect Username!! Please be sure to have a account!!");
            Signin();
        }
    }
    public static void data()
    {
        try(FileWriter fw = new FileWriter("Calculator.properties", true);
            BufferedWriter bw = new BufferedWriter(fw);
            FileOutputStream fileOut = new FileOutputStream("Calculator.properties");
            PrintWriter out = new PrintWriter(bw))
        {
            properties.setProperty("FirstName", firstname);
            properties.setProperty("LastName", lastname);
            properties.setProperty("Username", username);
            properties.setProperty("Password", password);
            properties.store(out, "Accounts");
            Signindesign();
        } catch (Exception e) {
            System.out.println("An unknown error occurred!!!");
        }
    }
    public static void Signup()
    {
        try {
            System.out.print("First Name: ");
            firstname = sc.next();
            System.out.print("Last Name: ");
            lastname = sc.next();
            System.out.print("Username: ");
            username = sc.next();
            System.out.print("Password: ");
            password = sc.next();
            data();
        }
        catch (Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
}