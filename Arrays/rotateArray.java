/*
 [1 2 3 ]
 [4 5 6 ]
 [7 8 9 ]

 [7 4 1 ] 
 [8 5 2 ] 
 [9 6 3 ] 
*/
import java.util.*;
import java.io.*;
public class rotateArray{

    static void rotate(int[][] a){
        int n=a.length;
        int tmp;
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                    tmp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=tmp;
            }       
        }
        printArr(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                tmp=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=tmp;
            }
        }
    printArr(a);
    }
    static void printArr(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotate2(int[][] matrix){
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[len - j - 1][i];
            matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
            matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
            matrix[j][len - i - 1] = tmp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        printArr(arr);
        rotate2(arr);
        printArr(arr);
    }
}