package Arrayss;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
public static  void main(String[] args){
    Scanner input = new Scanner(System.in);
//    int[] arr = new int[5];
//    arr[0] = 88;
//    arr[1] = 99;
//    arr[3] = 66;
//    arr[4] = 45;
//    // [88,99,66,45]
//   System.out.println(arr[3]);
//    System.out.println(Arrays.toString(arr));


    // input using for loop
//    for(int i = 0; i < arr.length; i++){
//        arr[i] = input.nextInt();
//    }
// for(int i = 0; i < arr.length; i++){
//    System.out.print(arr[i] + " ");
//}
    // for each loop
//for(int nums : arr){ // for every element in array, print the element
//    System.out.print(nums + " "); // here num represents element of the arrays
//}
//System.out.println(Arrays.toString(arr));


    // object in array

    String[] str = new String[5];
    for(int i =0; i < str.length; i++){
        str[i] = input.next();
    }
// modify
    str[1] = "jj";
    System.out.println(Arrays.toString(str));



}
}
