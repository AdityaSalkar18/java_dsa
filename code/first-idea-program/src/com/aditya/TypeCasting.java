package com.aditya;

//import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();


        // type casting
        int num = (int)(67.56f);
        System.out.println(num);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);
//
//        System.out.println(b);//257 % 265 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b/ c;
//
//        System.out.println(d);

//
//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(number);

//        System.out.println("नमस्ते");

//        System.out.println(3* 5.644666f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b)+ (i/c) - (d * s);
        //float + int - double = double
        System.out.println((f * b)+ " " +(i / c) + " " + (d + s));
        System.out.println(result);

    }
}
