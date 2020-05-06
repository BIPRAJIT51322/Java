package com.calculator;
import java.io.*;
import java.util.*;
public class Basic 
{
    public static Scanner sc = new Scanner(System.in);
    static Calculator calc = new Calculator();
    static Exit exit = new Exit();
    public static void add()
    {
        try
        {
             System.out.println("|--------------------------------------------------|");
             System.out.println("|--------------------Addition----------------------|");
             System.out.println("|--------------------------------------------------|");
             System.out.print("\nEnter the number of elements: ");
            int a = sc.nextInt();
            Double eleme [] = new Double[a];
            Double s = 0.0d;
            System.out.println("Enter the elements: ");
            for(int i = 0;i<a;i++) eleme[i] = sc.nextDouble();
            for (Double n : eleme) s=s+n;
            System.out.println("The elements are: ");
            for(int i = 0;i<a;i++)System.out.print(eleme[i]+" ");
            System.out.println("\nSum: "+s);
            calc.more();
        }
        catch(Exception e)
        {
            System.out.println("An unknown error occurred!!!");
            add();
        }
    }
    public static void sub()
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|-------------------Subtraction--------------------|");
            System.out.println("|--------------------------------------------------|");
        }
        catch (Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
    public static void multiply()throws IOException
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|-----------------Multiplication-------------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.print("\nEnter the number of elements: ");
            int a = sc.nextInt();
            Double eleme [] = new Double[a];
            Double s = 1d;
            System.out.println(" ");
            System.out.println("Enter the elements: ");
            for(int i = 0;i<a;i++)
            {
                eleme[i] = sc.nextDouble();
            }
            for (Double n : eleme)
            {
                s=s*n;
            }
            System.out.println("The elements are: ");
            for(int i = 0;i<a;i++)
            {
                System.out.print(eleme[i]+" ");
            }
            System.out.println("\nMultiplication: "+s);
            calc.more();
        }
        catch(Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
        calc.more();
    }
    public static void divide()
    {
        try
        {

        }catch (Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
    public static void table()
    {
        try
        {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|--------------Multiplication-Table----------------|");
            System.out.println("|--------------------------------------------------|");
            System.out.print("\nEnter the number: ");
            Double a = sc.nextDouble();
            System.out.print("How many times you would like to multiply "+a+": ");
            int n = sc.nextInt();
            for (int i = 1;i<=n;i++) System.out.println(a+" x "+i+" = "+(a*i));
            calc.more();
        }
        catch(Exception e)
        {
            System.out.println("An unknown error occurred!!!");
        }
    }
}