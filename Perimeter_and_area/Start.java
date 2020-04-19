import java.util.*;
public class Start
{
    public static Scanner sc  =new Scanner(System.in);
    public static void main()
    {
        Login log = new Login();
        Exit ext = new Exit();
        Area area = new Area();
        Perimeter peri = new Perimeter();
        if (log.log()==true)
        {
            Choice();
        }
        else ext.exit();
    }
    public static void Choice()
    {
        Login log = new Login();
        Exit ext = new Exit();
        Area area = new Area();
        Perimeter peri = new Perimeter();
        System.out.println("\nPress 1.Area\nPress 2.Perimeter\n");
        int a = sc.nextInt();
        if (a==1)
        {
            area.area();
        }
        else if (a==2)
        {
            peri.peri();
        }
    }
}