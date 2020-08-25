package com.biprajit.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int a[] = new int[3];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i=0;i<3;i++)
        {
            System.out.print("Enter the number "+(i+1)+": ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Smallest: "+a[0]);
    }
}
