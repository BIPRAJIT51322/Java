import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class Choice
{
    public static Scanner sc = new Scanner(System.in);
    public static void Choice() throws IOException, InterruptedException
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        Start srt = new Start();
        Exit exit = new Exit();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("\nYou can press 0 whenever you want to exit calculator");
        System.out.println("\nYou can press * wheneever you want to restart the calculator");
        System.out.println("---------------------------------------------------");
        System.out.println("What would you you like to do??");
        System.out.println("Press 1.Addition\nPress 2.Substraction\nPress 3.Multiplication\nPress 4.Division");
        String a = sc.next();
        Basic_Calc bc = new Basic_Calc();
        if (a.equals("1"))
        {
            bc.sum();
        }
        else if (a.equals("2"))
        {
            bc.sub();
        }
        else if (a.equals("3"))
        {
            bc.multi();
        }
        else if (a.equals("4"))
        {
            bc.divide();
        }
        else if (a.equals("*"))
        {
            srt.main();
        }
        else if (a.equals("0"))
        {
            exit.nexit();
        }
        else
        {
            System.out.println("Please enter the instructions given to you by the admin.\nenter go to continue");
            String abc = sc.next();
            if (abc.equals("go")||abc.equals("GO")||abc.equals("Go")||abc.equals("gO"))
            {
                Choice();
            }
            else 
            {
                System.out.println("As you are not following the instructions you have been kicked out of the program"); System.exit(0);
            }
        }
    }
    public static void repeat() throws IOException, InterruptedException
    {
        Exit exit = new Exit();
        System.out.println("\n\nPress 1.Would you like to do something more\nPress 2.Exit the program");
        int abc = sc.nextInt();
        if (abc == 1)
        {
            Choice();
        }
        else if (abc == 2)
        {
            exit.nexit();
        }
        else 
        {
            System.out.println("Please enter the instructions given to you by the admin.\nenter go to continue");
            String def = sc.next();
            if (def.equals("go")||def.equals("GO")||def.equals("Go")||def.equals("gO"))
            {
                repeat();
            }
            else 
            {
                System.out.println("As you are not following the instructions you have been kicked out of the program"); System.exit(0);
            }
        }
    }
}