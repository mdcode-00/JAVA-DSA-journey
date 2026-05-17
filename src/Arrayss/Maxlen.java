package Arrayss;

public class Maxlen {
    static void main() {
        int[] arr = {288,2,3,88,99,123};
        System.out.println(maxRange(arr , 0 , 6));
    }


// work on edge case here , like array  being null;;
    static int maxRange(int[] arr , int start, int end) {
        if(arr == null){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }

        if(end < start){
            return -1;
        }

        int maxLen = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxLen){
                maxLen = arr[i];
            }
        }
        return  maxLen;
    }


//    static int max(int[] arr) {
//        int maxLen = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > maxLen){
//            maxLen = arr[i];
//            }
//        }
//        return  maxLen;
//    }
}
