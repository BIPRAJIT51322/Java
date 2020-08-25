//We will use Scanner and Arrays by importing java.util;.
import java.util.*;
//2nd program.
public class nth_smallest_and_largest
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        //variable a defining the array with 10 integers.
        int[] a = new int[10];
        //for loop to take the input in the array.
        for(int i=0;i<10;i++)
        { 
            System.out.print("Enter the value "+(i+1)+": "); 
            a[i]= sc.nextInt();
        }
        //Taking the user input for the n'th value.
        System.out.print("Enter the n'th value of the smallest and largest number you want: ");
        int n = sc.nextInt();
        Arrays.sort(a);
        //Defining the smallest element.
        System.out.print("The n'th smallest element is "+(a[n-1]));
        //Defining the largest element.
        System.out.print(" and the n'th largest element is "+(a[10-n]));
    }
}
/*
 * variable "a" is a single dimensional array which can contain 10 integers and takes input from user.
 * variable "n" is a n'th no. of element which the user wants.
 */