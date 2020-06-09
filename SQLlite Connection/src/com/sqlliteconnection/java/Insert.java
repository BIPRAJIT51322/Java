package com.sqlliteconnection.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

public class Insert {
    public static String a,b,c,d,sql;
    public static PreparedStatement ps;
    public static Connection con = Connect.main();
    public static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        try{
            System.out.print("First Name: ");
            a = sc.next().trim();
            System.out.print("Last Name: ");
            b = sc.next().trim();
            System.out.print("Username: ");
            c = sc.next().trim();
            System.out.print("Password: ");
            d = sc.next().trim();
            insert(a, b, c, d);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void insert(String a,String b,String c,String d)
    {
        try{
            sql = "INSERT INTO Users(FirstName,LastName,Username,Password) VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, a);
            ps.setString(2, b);
            ps.setString(3, c);
            ps.setString(4, d);
            ps.execute();
            System.out.println("Data Inserted");
            ps.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
