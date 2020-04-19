import java.util.*;
import java.lang.Math;
public class Right_angled_triangle
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Username: ");
        String a = sc.next();
        System.out.print("Password: ");
        String b = sc.next();
        System.out.println("");
        if (a.equals("BG")&&b.equals("2006"))
        {
            System.out.println("Welcome Biprajit Ghosh");
            Calc();
        }
        else 
        {
            Exit();
        }
    }
    public static void Calc()
    {
        System.out.println("\nPress 1.Find Hypotenuse\nPress 2.Find Base\nPress 3.Find Height");
        int a = sc.nextInt();
        if (a==1)
        {
            Hypotenuse();
        }
        if (a==2)
        {
            Base();
        }
        if (a==3)
        {
            Height();
        }
    }
    public static void Hypotenuse()
    {
        System.out.print("Base: ");
        int a = sc.nextInt();
        System.out.print("Height: ");
        int b = sc.nextInt();
        System.out.print("Unit: ");
        String unit = sc.next();
        System.out.println("As we know Base sq. unit + Height sq. unit = Hypotenuse Sq. unit");
        int d = a*a; 
        int e = b*b;
        System.out.println("Base sq. = "+d+" "+unit+"");  
        System.out.println("Height sq. = "+e+" "+unit+"");
        int f = d+e;
        System.out.println(d+" "+unit+" + "+e+" "+unit+" = "+f+" "+unit);
        System.out.println("So the hypotenuse is "+Math.sqrt(f)+" "+unit);
    }
    public static void Base()
    {
        System.out.print("Hypotenuse: ");
        int a = sc.nextInt();
        System.out.print("Height: ");
        int b = sc.nextInt();
        System.out.print("Unit: ");
        String unit = sc.next();
        System.out.println("As we know Base sq. unit + Height sq. unit = Hypotenuse Sq. unit");
        int d = a*a; 
        int e = b*b;
        System.out.println("Hypotenuse sq. = "+d+" "+unit+"");  
        System.out.println("Height sq. = "+e+" "+unit+"");
        int f = d-e;
        System.out.println(d+" "+unit+" + "+e+" "+unit+" = "+f+" "+unit);
        System.out.println("So the base is "+Math.sqrt(f)+" "+unit);
    }
    public static void Height()
    {
        System.out.print("Base: ");
        int a = sc.nextInt();
        System.out.print("Hypotenuse: ");
        int b = sc.nextInt();
        System.out.print("Unit: ");
        String unit = sc.next();
        System.out.println("As we know Base sq. unit + Height sq. unit = Hypotenuse Sq. unit");
        int d = a*a; 
        int e = b*b;
        System.out.println("Base sq. = "+d+" "+unit+"");  
        System.out.println("Hypotenuse sq. = "+e+" "+unit+"");
        int f = e-d;
        System.out.println(d+" "+unit+" + "+e+" "+unit+" = "+f+" "+unit);
        System.out.println("So the height is "+Math.sqrt(f)+" "+unit);
    }
    public static void Exit()
    {
        System.out.println("System % boot installed%");
        System.out.println("%AppData B-spyware by BG installed%");
        System.out.println("%new% %password*% &set&: 21062006");
        System.out.println("a = new(%userprofile%/%ipaddress%/%PC user%)");
        System.out.println("Send pc data to ip%bg.github.a%");
        System.out.println("You are hacked by Biprajit Ghosh");
        System.exit(0);
    }
}