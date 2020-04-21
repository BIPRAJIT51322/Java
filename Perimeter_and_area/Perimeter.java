import java.util.*;
public class Perimeter
{
    public static Scanner sc = new Scanner(System.in);
    public static void peri(String[] args)
    {
       System.out.println("=============================================");
       System.out.println("==================Perimeter==================");
       System.out.println("=============================================");
       System.out.println("Press 1.Perimeter of Circle\nPress 2.Perimeter of Triangle\nPress 3.Perimeter of Square\nPress 4.Perimeter of Rectangle\n");
       int choice = sc.nextInt();
       if (choice==1)
       {
           Circle();
       }
       else if (choice==2)
       {
           Triangle();
       }
       else if (choice==3)
       {
           Square();            
       }
       else if (choice==4)
       {
            Rectangle();  
       }
       else 
       {
           System.out.println("Please enter the integers given in the options");
       }
    }
    public static void Circle()
    {
        System.out.println("CIRCLE");
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("Enter the unit");
        String b = sc.next();
        double pi = 3.14;
        double rsq = 2*pi*r;
        System.out.println("Perimeter: "+rsq+" "+b);   
    }
    public static void Triangle()
    {
        System.out.println("TRIANGLE");
        System.out.println("Enter the first side of the triangle: ");
        double i = sc.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double j = sc.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double k = sc.nextDouble();
        System.out.println("Enter the unit");
        String b = sc.next();
        double ans = i+j+k;
        System.out.println("Area: "+ans+" "+b);
    }
    public static void Square()
    {
        System.out.println("SQUARE");
        System.out.println("Enter the side of the square: ");
        double r = sc.nextDouble();
        System.out.println("Enter the unit: ");
        String b = sc.next();
        double ans = r*4;
        System.out.println("Area: "+ans+" "+b);
    }
    public static void Rectangle()
    {
        System.out.println("RECTANGLE");
        System.out.println("Enter the one side of the rectangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter the one side of the rectangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter the unit: ");
        String u = sc.next();
        double ans = 2*(l+b);
        System.out.println("Area: "+ans+" "+u);
    }
	
}