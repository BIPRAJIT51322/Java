import java.util.*;
import java.io.*;
public class readme
{
    public static Scanner sc = new Scanner(System.in);
    public static void readme() throws IOException, InterruptedException
    {
        pageone po = new pageone();
        Exit exit = new Exit();
        Start srt = new Start();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        BufferedReader br = new BufferedReader(new FileReader("README.TXT"));
        for (String line;(line = br.readLine()) !=null;)
        {
            System.out.println(line);
        }
        br.close();
        System.out.println("\nPress back to go back");
        String a = sc.next();
        if (a.equals("back")||a.equals("Back")||a.equals("BACK"))
        {
            po.one();
        }
        else if (a.equals("0"))
        {
            exit.nexit();
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
                readme();
            }
            else 
            {
                System.out.println("As you are not following the instructions you have been kicked out of the program"); System.exit(0);            
            }
        }
    }
}