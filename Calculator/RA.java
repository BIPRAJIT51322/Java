package com.calculator;
import java.io.*;
import java.util.Scanner;

public class RA {
    public static Scanner sc = new Scanner(System.in);
    static Start start = new Start();
    static Exit exit = new Exit();
    public static void readme() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programs\\Programs\\Java\\Calculator\\src\\com\\calculator\\Readme.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            back();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void about() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programs\\Programs\\Java\\Calculator\\src\\com\\calculator\\About.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            back();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void back() throws IOException {
        try {
            System.out.println("Press 0 to go back");
            System.out.println("Press 1 to Restart Calculator");
            System.out.println("Press 2 to Exit");
            int a = sc.nextInt();
            if (a == 1) start.design();
            else if (a == 0) start.design();
            else if (a == 2) exit.exit();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}