package com.sqlliteconnection.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

public class Insert {
    public static PreparedStatement ps;
    public static Connection con = Connect.main();
    public static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        try{
            System.out.print("First Name: ");
            String a = sc.next().trim();
            System.out.print("Last Name: ");
            String b = sc.next().trim();
            System.out.print("Username: ");
            String c = sc.next().trim();
            System.out.print("Password: ");
            String d = sc.next().trim();
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
            String sql = "INSERT INTO Users(FirstName,LastName,Username,Password) VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, a);
            ps.setString(2, b);
            ps.setString(3, c);
            ps.setString(4, d);
            ps.execute();
            System.out.println("Data Inserted");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            try
            {
                ps.close();
                con.close();
                System.out.println("Database Disconnected");
                Main.main(null);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
