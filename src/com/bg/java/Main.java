package com.bg.java;
import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	start();
    }
    public static void start()
    {
        System.out.println("|--------------------------------------------------|");
        System.out.println("|------------------------Shape---------------------|");
        System.out.println("|1. Draw a rectangle                               |");
        System.out.println("|2. Draw a Square                                  |");
        System.out.println("|--------------------------------------------------|");
        choice();
    }
    public static void choice()
    {
        System.out.println("Choice: ");
        int a = sc.nextInt();
        if(a==1)
        {
            rectangle();
        }
        else if(a==2)
        {
            square();
        }
        else
        {
            System.out.println("Bye");
        }
    }
    public static void square()
    {
        System.out.println("----------");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("----------");
    }
    public static void rectangle()
    {
        System.out.println("__________");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("__________");
    }
}
