import java.util.*;
public class Area
{
    public static Scanner sc = new Scanner(System.in);
    public static void area(String[] args)
    {
       System.out.println("=============================================");
       System.out.println("====================Area=====================");
       System.out.println("=============================================");
       System.out.println("Press 1.Area of Circle\nPress 2.Area of Triangle\nPress 3.Area of Square\nPress 4.Area of Rectangle\n");
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
        double rsq = r*r;
        System.out.println("Area: "+(pi*rsq)+" "+b+" sq.");   
    }
    public static void Triangle()
    {
        System.out.println("TRIANGLE");
        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double hei = sc.nextDouble();
        System.out.println("Enter the unit");
        String b = sc.next();
        double half = 0.5;
        double ans = half*base*hei;
        System.out.println("Area: "+ans+" "+b+" sq.");
    }
    public static void Square()
    {
        System.out.println("SQUARE");
        System.out.println("Enter the side of the square: ");
        double r = sc.nextDouble();
        System.out.println("Enter the unit: ");
        String b = sc.next();
        double ans = r*r;
        System.out.println("Area: "+ans+" "+b+" sq.");
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
        double ans = l*b;
        System.out.println("Area: "+ans+" "+u+" sq.");
    }
}