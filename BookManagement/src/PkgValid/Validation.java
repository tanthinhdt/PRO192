package PkgValid;

import java.time.Year;
import java.util.Scanner;

public class Validation {
    // Used to input a positive integer number
    public static int inputPosNumber(String message) throws Exception {
        int num;  
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        num = sc.nextInt();
        if (num <= 0) throw new Exception("Negative Number");
        return num;
    }
    
    // Used to input a positive integer number
    public static int inputNNegNumber(String message) throws Exception {
        int num;  
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        num = sc.nextInt();
        if (num < 0) throw new Exception("Negative Number");
        return num;
    }
    
    public static int inputNNegNumber(int num) throws Exception {
        if (num < 0) throw new Exception("Negative Number");
        return num;
    }
    
    // Used to input a year
    public static int inputYear(String message, int year0) throws Exception {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        year = sc.nextInt();
        if (year < year0 || year > Year.now().getValue()) throw new Exception();
        return year;
    }
    
    public static int inputYear(int year, int year0) throws Exception {
        if (year < year0 || year > Year.now().getValue()) throw new Exception();
        return year;
    }
    
    // Used to input a string
    public static String inputString(String message, String pattern) throws Exception {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        str = sc.nextLine();
        if (!str.matches(pattern)) throw new Exception();
        return str; 
    }
    
    // Used to input a boolean value
    public static boolean inputBool(String message, String pattern) throws Exception {
        String value = inputString(message, pattern);
        if (value.matches("[nN]"))
            return false;
        return true;
    }
}
