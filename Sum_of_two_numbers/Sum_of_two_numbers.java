import java.util.Scanner;
public class Sum_of_two_numbers
{  static Scanner sc = new Scanner(System.in);
   public void main()
    {
        System.out.println("Enter the first number: "); 
        int b = sc.nextInt();
        System.out.println("Enter the second number: ");
        int c = sc.nextInt();
        int d = b+c;
        System.out.println(b+" + "+c+" = "+d);
    }
}
