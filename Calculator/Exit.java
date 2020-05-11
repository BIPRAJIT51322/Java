package com.calculator;

import java.io.IOException;

public class Exit
{
    static Start start = new Start();
    public static void exit()
    {
        System.out.println("Thank you for using our service");
    }
    public void wrong_input_exit()throws IOException
    {
        System.out.println("As you have not followed the instructions given by the Calculator so the Calculator has reset");
        start.design();
    }
    public static void wrong()
    {
        System.out.println("It seems like you dont belong to the program");
        System.exit(0);
    }
}