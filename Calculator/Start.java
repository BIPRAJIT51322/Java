import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class Start 
{ 
    public static Scanner sc = new Scanner(System.in);
    public static void main() throws IOException, InterruptedException
    {
        pageone po = new pageone();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        po.one();
    }
}