package Basics;

import java.util.Scanner;

public class Temprature {
public static  void main(String[] args){
    Scanner input = new Scanner(System.in);

    float cal = input.nextFloat();
    System.out.print("Write calcius here: ");
   float sum = (cal * 9/5)+32;
   System.out.println(sum);
}


}
//s: \(^\circ\text{C} 32.89= \frac{5}{9} \times (^\circ\text{F} - 32)\)