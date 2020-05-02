package com.calculator;
import java.io.*;
import java.sql.*;
import java.util.*;
public class Login
{
    public static Scanner sc = new Scanner(System.in);
    static Exit exit = new Exit();
    static Start start = new Start();
    static Calculator calc = new Calculator();
    static Connection connect = null;
    static String firstname, lastname, username, password;
    static String userin, passin;
    static PreparedStatement pst = null;
    static ResultSet rs = null;
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
            System.out.println("An internal error occurred!!!!");
        }
    }
    public static void test()throws IOException
    {
        try {
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) Signin();
            else if (choice == 2) Signup();
            else if (choice == 3) exit.exit();
            else if (choice == 4) start.design();
            else {
                System.out.println("Please follow the instructions given by the calculator!!");
                test();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void Signin()
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|-----------------------Login----------------------|");
            System.out.println("|--------------------------------------------------|");
            connect=SQLiteConnection.connect();
            String query = "select * from Users";
            pst = connect.prepareStatement(query);
            rs = pst.executeQuery();
            String username = rs.getString("Username");
            String password = rs.getString("Password");
            System.out.print("Username: ");
            userin = sc.next();
            if (userin.equals(username))
            {
                for (int i=0;i<6;i++)
                {
                    System.out.print("Password: ");
                    passin = sc.next();
                    if (userin.equals(username)&&passin.equals(password))
                    {

                        calc.calculator();
                        break;
                    }
                    else
                    {
                        int t = 6;
                        t--;
                        Signin();
                        if (t==0) {exit.wrong();break;}
                    }
                }
            }
            else
            {
                System.out.println("Incorrect Username!! Please try again...");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            try
            {rs.close();
                pst.close();
                connect.close();
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void Signup()
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|----------------------Register--------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("First Name: ");
            firstname = sc.next();
            System.out.println("Last Name: ");
            lastname = sc.next();
            System.out.println("Username: ");
            username = sc.next();
            System.out.println("Password: ");
            password = sc.next();
        }
        catch (Exception e)
        {

        }
    }
}