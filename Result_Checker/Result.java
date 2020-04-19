import java.util.*;
import java.io.*;
public class Result
{
    static double total,sch,sch1,sch2,name,obt;
    static String a,b,surname,clas;
    static String[] sub = new String[10];
    static char[] grd = new char[10];
    static double[] full = new double[10];
    static double[] got = new double[10];
    static double[] per = new double[10];
    public static Scanner sc = new Scanner(System.in);
    public static void result() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Result rslt = new Result();
        System.out.print("Enter your school name: ");
        String sch = sc.next();
        String sch1 = sc.next();
        String sch2 = sc.next();
        System.out.print("Enter your full name: ");
        String name = sc.next();
        String surname = sc.next();
        System.out.print("Enter your class: ");
        String clas = sc.next();
        for (int i=1;i<=10;i++)
        {
          System.out.print("Enter subject no. "+i+": ");
          sub[i-1] = sc.next();
          System.out.print("Total marks in "+sub[i-1]+": ");
          full[i-1] = sc.nextDouble();
          System.out.print("Marks obtained in "+sub[i-1]+": ");
          got[i-1] = sc.nextDouble();
          per[i-1]=got[i-1]/full[i-1]*100;
          total+=full[i-1];
          obt+=got[i-1];
          grd[i-1]=(per[i-1]>85)?'A':(per[i-1]>75)?'B':(per[i-1]>60)?'C':(per[i-1]>50)?'D':'E';
        }
        output();
    }
    public static void output() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("---------------------Result Checker by Biprajit Ghosh-----------------------");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(sch+" "+sch1+" "+sch2);
        System.out.println("Name: "+name+" "+surname+"                Class: "+clas);
        System.out.println("| Subject\t\t| Total marks\\t| Marks Obtained\t| Percentage\t| Grade\t|");
        for(int i=1;i<=10;i++)
        System.out.println("|"+sub[i-1]+"\t\t\t|"+full[i-1]+"\t\t|"+got[i-1]+"\t\t|"+per[i-1]+"%\t\t|"+grd[i-1]+"\t|");
        System.out.println("Total marks: "+total+"\tMarks Obtained: "+obt+"\tPercentage: "+(obt/total)*100);
    }
}