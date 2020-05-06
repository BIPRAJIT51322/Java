package com.calculator;
import java.io.*;
import java.util.*;
public class Start
{
    public static Scanner sc = new Scanner(System.in);
    static Login login = new Login();
    static Exit exit = new Exit();
    static RA ra = new RA();
    public static void main(String[] args)throws IOException {
        design();
    }
    public static void design()throws IOException
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------------Calculator--------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Press 1. Login                                    |");
            System.out.println("|Press 2. View Readme                              |");
            System.out.println("|Press 3. View About                               |");
            System.out.println("|Press 4. Restart Calculator                       |");
            System.out.println("|Press 5. Exit Calculator                          |");
            System.out.println("|--------------------------------------------------|");
            choose();
        }
        catch (Exception e)
        {
            System.out.println("An unknown error occurred!!!!");
        }
    }
    public static void choose()throws IOException
    {
        try
        {
            System.out.print("Choice: ");
            int a = sc.nextInt();
            if (a == 1) login.Login();
            else if (a == 2) ra.readme();
            else if (a == 3) ra.about();
            else if (a == 4) design();
            else if (a == 5) exit.exit();
            else {System.out.println("Please follow the instructions given by the calculator!!"); choose();}
        }
        catch (Exception e)
        {
            System.out.println("Please enter a integer not a letter, alphabet or a symbol. Please restart the Calculator!!!!");
            System.out.println("Shutting down Calculator..../n");
        }
    }
}