import java.util.*;
import java.io.*;
public class Start
{
    public static Scanner sc = new Scanner(System.in);
    public static void main() throws IOException, InterruptedException
    {
        Login log = new Login();
        Result rslt = new Result();
        Exit ext = new Exit();
        if (log.login()==true)
        {
            rslt.result();
        }
        else ext.exit();
    }
}
