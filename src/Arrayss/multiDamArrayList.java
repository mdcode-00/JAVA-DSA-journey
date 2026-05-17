package Arrayss;

import java.util.ArrayList;
import java.util.Scanner;

public class multiDamArrayList {
    static void main() {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


//        initialisation;;
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 5; i++) {
            list.get(i).add(in.nextInt());
        }

        System.out.println(list);


    }
}
