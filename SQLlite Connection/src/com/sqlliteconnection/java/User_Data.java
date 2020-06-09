package com.sqlliteconnection.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class User_Data {
    public static Connection con = Connect.main();
    public static Scanner sc = new Scanner(System.in);
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql,first,last,user,pass;
    public static void main()
    {
        System.out.print("Username: ");
        user = sc.next();
        Get(user);
    }
    public static void Get(String user)
    {
        try{
            sql = "SELECT * from Users where Username = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            first = rs.getString(1);
            last = rs.getString(2);
            pass = rs.getString(4);

            System.out.println("\nFirst Name: "+first);
            System.out.println("Last Name: "+last);
            System.out.println("Username: "+user);
            System.out.println("Password: "+pass+"\n");
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
