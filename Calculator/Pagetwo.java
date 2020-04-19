import java.io.*;
import java.time.*;
import java.time.format.*;
public class Pagetwo
{
    public static void two() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        Exit ext = new Exit();
        Start srt = new Start();
        Login login = new Login();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("\n\nLets verify you first");
        System.out.println("\nYou can press 0 whenever you want to exit calculator");
        System.out.println("\nYou can press * wheneever you want to restart the calculator");
        System.out.println("---------------------------------------------------");
        login.login();
    }
}