package com.bg.sentence;
import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the sentence: ");
        String a = sc.next();
        int b= a.length();
        System.out.println("The length of the sentence with spaces is "+b);
    }
}
