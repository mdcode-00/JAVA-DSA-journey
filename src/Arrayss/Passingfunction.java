package Arrayss;

import java.util.Arrays;

public class Passingfunction {
 static void main() {
int[] nums = {3,4,5,6};
System.out.println(Arrays.toString(nums));
change(nums);
System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[1] = 0;
    }

}
