package com.sqlliteconnection.java;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class All_users {
    public static Connection con = Connect.main();
    public static Scanner sc = new Scanner(System.in);
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql,first,last,user,pass;
    public static void main()
    {
        try{
            sql = "SELECT * from Users";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("All Users");
            while(rs.next())
            {
                first=rs.getString("FirstName");
                last=rs.getString("LastName");
                user=rs.getString("Username");
                pass=rs.getString("Password");

                System.out.println("\nFirst Name: "+first);
                System.out.println("Last Name: "+last);
                System.out.println("Username: "+user);
                System.out.println("Password: "+pass+"\n");
            }
            rs.close();
            ps.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
