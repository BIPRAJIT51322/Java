import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
public class Basic_Calc
{
    public static Scanner sc = new Scanner(System.in);
    static double sum;
    static Choice choice = new Choice();
    public static void sum() throws IOException, InterruptedException
    { 
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Exit exit = new Exit();
        Choice Choice = new Choice();
        Start srt = new Start();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the number of elements");
        int a = sc.nextInt();
        double[] array = new double[a];
        double sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<a; i++)
        {
     	   array[i] = sc.nextDouble();
        }
        for( double num : array) 
        {
            sum = sum+num;
        }
        System.out.println("The sum of your elements is: "+sum);
        choice.repeat();
    }
    public static void sub() throws IOException, InterruptedException
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Exit exit = new Exit();
        Choice Choice = new Choice();
        Start srt = new Start();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the of elements: ");
        for(int i=0;i<a.length;i++)

        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sub=0;
        for(int i=a.length-1;i>=0;i--)

        {
           sub=sub-a[i];
          if(i==(a.length-1))

       

            sub=-1*sub;
        }
        System.out.println("The difference of all the elements is: "+sub);
        choice.repeat();
    }
    public static void multi() throws IOException, InterruptedException
    {
         DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Exit exit = new Exit();
        Choice Choice = new Choice();
        Start srt = new Start();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the number of elements");
        int a = sc.nextInt();
        double[] array = new double[a];
        sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<a; i++)
        {
     	   array[i] = sc.nextDouble();
        }
        for( double num : array) 
        {
            sum = sum*num;
        }
        System.out.println("The sum of your elements are:"+sum);
        choice.repeat();
    }
    public static void divide() throws IOException, InterruptedException
    {
         DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dati = LocalDateTime.now();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Exit exit = new Exit();
        Choice Choice = new Choice();
        Start srt = new Start();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------Calculator--------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Date: "+df.format(dati)+"     Time: +"+tf.format(dati));
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the number of elements");
        int a = sc.nextInt();
        double[] array = new double[a];
        sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<a; i++)
        {
     	   array[i] = sc.nextDouble();
        }
        for( double num : array) 
        {
            sum = sum/num;
        }
        System.out.println("The sum of your elements are:"+sum);
        choice.repeat();
    }
}