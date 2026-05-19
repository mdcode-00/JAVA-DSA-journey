package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    static void main(String[] args) {
        /*
        *  1 2 3
        *  4 5 6
        *  7 8 9
        **/

//        int[][] arr = new int[3][]; // col and rows
//int [][] arr2d = {
//        {1,2,3}, // 0 index
//        {4,5},// 1 index
//        {6,7,8,9} // 2 index
//};
// input
//        int[][] arr = new int[3][3];
//        Scanner input = new Scanner(System.in);
//        for(int row = 0; row<arr.length; row++){
//            // for each col in row
//            for(int col = 0; col < arr[row].length; col++){
//                arr[row][col] = input.nextInt();
//            }
//        }

        //out put
//        for(int row = 0; row<arr.length; row++){
//            // for each col in row
//            for(int col = 0; col < arr[row].length; col++){
//             System.out.print(arr[row][col] + " ");
//            }
//
//            System.out.println();
//        }

        //out put
//        for(int row = 0; row<arr.length; row++){
//            // for each col in row
//            System.out.println(Arrays.toString(arr[row]));
//        }

//
//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }
//i string
//for(String element: arr){
//    System.out.println(element);
//}
        int[][] mat = {
                {1,2},
                {3,4}
        };
   int[][] reshapedMat =  matrixReshape(mat , 1 , 4);
        System.out.println(Arrays.deepToString(reshapedMat));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m *n){
            return mat;
        }

        int[][] res = new int[r][c];
            for(int i =0; i<r*c; i++){
               res[i / c][i % c] = mat[i / n][i % n];
            }
            return res;
        }

}
