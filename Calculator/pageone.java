import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class pageone 
{
    public static Scanner sc = new Scanner(System.in);
    public static void one() throws IOException, InterruptedException
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        readme read = new readme();
        about about = new about();
        Exit ext = new Exit();
        Start srt = new Start();
        Login login = new Login();
        Pagetwo pt = new Pagetwo();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("\n\nPress enter to ENTER the Calculator");
        System.out.println("\nYou cnan press 0 whenever you want to exit calculator");
        System.out.println("\nYou can press * whenever you want to restart the calculator");
        System.out.println("\nPress readme to view the readme of the project");
        System.out.println("\nPress about to view how to use this project");
        System.out.println("---------------------------------------------------");
        String a = sc.next();
        if (a.equals("Enter")||a.equals("enter")||a.equals("ENTER"))
        {
            pt.two();
        }
        else if (a.equals("readme")||a.equals("Readme")||a.equals("README"))
        {
            read.readme();
        }
        else if (a.equals("about")||a.equals("About")||a.equals("ABOUT"))
        {
            about.about();
        }
        else if (a.equals("0")) 
        {
            ext.nexit();
        }
        else if (a.equals("*"))
        {
            srt.main();
        }
        else
        {
            System.out.println("Please enter the instructions given to you by the admin.\nenter go to continue");
            String abc = sc.next();
            if (abc.equals("go")||abc.equals("GO")||abc.equals("Go")||abc.equals("gO"))
            {
                srt.main();
            }
            else 
            {
                System.out.println("As you are not following the instructions you have been kicked out of the program"); System.exit(0);
            }
        }
     }
}