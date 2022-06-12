package com.targetIndia.utils;
import java.util.Scanner;
public final class KeyboardUtil {
    private KeyboardUtil(){}
    public static String getString(String message){
        Scanner sc=new Scanner(System.in);
        System.out.println(message);
        String str=sc.nextLine();
        return sc.nextLine();
    }
    public static double getDouble(String message){
        System.out.print(message);
        Scanner sc=new Scanner(System.in);
        return sc.nextDouble();
    }
    public static int getInt(String message){
        Scanner sc=new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}
