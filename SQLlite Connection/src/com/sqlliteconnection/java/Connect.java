package com.sqlliteconnection.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static Connection con;
    public static Connection main()
    {
        con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:Data.sqlite");
            System.out.println("Database Connected");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.print("An error occurred");
        }
        return con;
    }
}
