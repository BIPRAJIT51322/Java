import java.io.*;
public class Exit
{
    public static void npexit() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("You have tried to login for 6 times and you have failed.So it seems you are not the part of the project");
        System.exit(0);
    }
    public static void nexit() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Thank you for using our service");
        System.exit(0);
    }
}