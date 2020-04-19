import java.io.*;
public class Exit
{
    public static void exit() throws IOException, InterruptedException
    { 
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Wrong Username or password");
        System.exit(0);
    }
}