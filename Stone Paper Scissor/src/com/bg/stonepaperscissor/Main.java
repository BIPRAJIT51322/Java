package com.bg.stonepaperscissor;
import java.util.*;
public class Main {
    static String p1, p2;
    static String stone="Stone", paper="Paper", scissor="Scissor";
    static int a,b;
    static String po1, po2;
    static String result;
    static String tie="Tie!!";
    static String abc = "", bcd= "";
    static int score1, score2;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        try {
                start();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void start()
    {
        try {
            System.out.print("Player 1: ");
            p1 = sc.next().trim();
            System.out.print("Player 2: ");
            p2 = sc.next().trim();
            if(p1.equals(p2))
            {
                System.out.println("Player 1 name is same to Player 2 name");
                p1.equals(abc);
                p2.equals(bcd);
                start();
            }
            else
            {
               calculate();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void calculate()
    {
        try{
            double random1 = Math.random();
            double random2 = Math.random();
            double x = random1 * 3, y = random2 * 3;
            a = (int) x + 1;
            b = (int) y + 1;
            set();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void set()
    {
        try{
            if (a == 1) {
                po1 = stone;
            } else if (a == 2) {
                po1 = paper;
            } else if (a == 3) {
                po1 = scissor;
            }
            if (b == 1) {
                po2 = stone;
            } else if (b == 2) {
                po2 = paper;
            } else if (b == 3) {
                po2 = scissor;
            }
            result();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void result()
    {
        try{
            if (a == 1 && b == 1) {
                result = tie;
            } else if (a == 1 && b == 2) {
                result = p2 + " Won!";
                score2 = score2+1;
            } else if (a == 1 && b == 3) {
                result = p1 + " Won!";
                score1 = score1+1;
            } else if (a == 2 && b == 1) {
                result = p1 + " Won!";
                score1 = score1+1;
            } else if (a == 2 && b == 2) {
                result = tie;
            } else if (a == 2 && b == 3) {
                result = p2 + " Won!";
                score2 = score2+1;
            } else if (a == 3 && b == 1) {
                result = p2 + " Won!";
                score2 = score2+1;
            } else if (a == 3 && b == 2) {
                result = p1 + " Won!";
                score1 = score1+1;
            } else if (a == 3 && b == 3) {
                result = tie;
            }
            output();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void output() {
        try {
            System.out.println(p1+": "+po1+"\t\t\t"+p2+": "+po2);
            System.out.println(result);
            System.out.println(p1+": "+score1+"\t\t\t"+p2+": "+score2);
            next();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void next()
    {try{
        System.out.println("Press 1. Repeat the game\nPress 2. Exit and get the score");
        int zz  = sc.nextInt();
        if (zz==1)
        {
            calculate();
        }
        else if(zz==2)
        {
            System.out.println(p1+":\t"+score1+"\t\t\t"+p2+":\t"+score2);
            System.exit(0);
        }
        else
        {
            System.out.println("Follow the instructions!!");
            next();
        }
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
    }

}
