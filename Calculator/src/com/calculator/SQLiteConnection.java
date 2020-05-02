package com.calculator;
import java.sql.*;
public class SQLiteConnection {
    static Connection con = null;
    public static Connection connect()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = (Connection) DriverManager.getConnection("jdbc:sqlite:D:\\Programs\\Programs\\Java\\Calculator\\src\\com\\calculator\\data.sqlite");
            System.out.println("Database Connected");
        } catch (Exception e )
        {
            System.out.println("We are unable to connect to the database.");
        }
        return con;
    }
}
