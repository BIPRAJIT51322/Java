//We will use Scanner by importing java.util;.
import java.util.*;
//1st program.
public class single_digit_in_array
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        //variable a defining the array with 9 integers.
        int[] a = new int[9];
        //for loop to take the input in the array.
        for(int i=0;i<9;i++)
        { 
            System.out.print("Enter the value "+(i+1)+": "); 
            a[i]= sc.nextInt();
        }
        //the copy of the array for xor.
        int b = a[0];
        //for loop for xor.
        for(int i=1;i<a.length;i++)
        {   
            b=b^a[i];
        }
        //result.
        System.out.println("The element which is not repeated is "+b);
    }
}
/*
 * Variables 
 * variable "a" is a single dimensional array which can contain 9 integers and takes input from user.
 * variable "b" is the copy of the array and with for loop the the elements of the array have (a[0]^a[0])^(a[1]^a[0])^(a[2]^a[0])^(a[3]^a[0])^(a[4]^a[0])^
 * (a[5]^a[0])^(a[6]^a[0])^(a[7]^a[0])^(a[8]^a[0])
 */