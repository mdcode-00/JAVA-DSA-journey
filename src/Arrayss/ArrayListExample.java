package Arrayss;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main() {
        // syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//    list.add(67);
//        list.add(47);
//        list.add(4237);
//        list.add(67355552);
//        list.add(67);
//        list.add(67324);
//        list.add(673);
//        list.add(47);
//        list.add(4237);
//        list.add(6732);
//        list.add(67);
//        list.add(67324);
//        list.add(673);
//        System.out.println(list);
//        System.out.println(list.contains(57645));
//        list.set(0,99);
//        list.remove(3);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here , list [index] syntax will not working;
        }
//        System.out.println(list);


    }
}
