package com.sqlliteconnection.java;

import java.util.*;
public class Main {
    public static int a;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try
        {
            Connect.main();
            System.out.println("Press 1 to insert data");
            System.out.println("Press 2 to get all users");
            System.out.print("Choice: ");
            a = sc.nextInt();
            if(a==1)
            {
                Insert.main();
            }
            else if(a==2)
            {
                All_users.main();
            }
            else
            {
                System.out.println("Be sure to use the given commands");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
