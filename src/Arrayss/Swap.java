package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5,6};
//        swap(arr,1,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        System.out.println(start);
        int end = arr.length-1;
        System.out.println(end);
        while (start < end) {
            // swap function
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1, int index2 ) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;

    }

}
