package Basics;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class TypeCasting {
public static void main(String[] arg){
    Scanner input  = new Scanner(System.in);
//    float num = input.nextFloat();
//    int num2 = input.nextInt();
//    System.out.println(num2);

//    type casrting

//int num = (int)(99.0978);
//System.out.println(num);

//automating type promotion
//    int a  = 257;
//    byte b = (byte)(a); /// 257 % 256 = 1
//    System.out.println(b);

//    byte a = 40;
//    byte b = 50;
//    byte c = 100;
//    int sum = (a*b) / c;
//    System.out.println(sum);


//byte b = 50;
//b = b *2 /// because it is int


    //// alfabatic value

//    int number = 'A';
//    System.out.println(number);

    /// All
    byte b = 42;
    char c = 'a';
    short s = 1024;
    char i = 50000;
    float f =5.67f;
    double d = 0.366;
    double result = (f*b) + (i / c) - (d*s);
    // float + int - double = double
    System.out.println((f*b) +" "+ (i / c) +" "+ (d*s));
    System.out.println(result);

}
}
