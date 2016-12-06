/**
*   Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
*   Example:
*   Given the following matrix:
*   [
*       [ 1, 2, 3 ],
*       [ 4, 5, 6 ],
*       [ 7, 8, 9 ]
*   ]
*   You should return
*
*   [1, 2, 3, 6, 9, 8, 7, 4, 5]
*
*
*
*
**/
import java.io.*;
import java.util.*;

public class spiralMatrix {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
         ArrayList<Integer> result = new ArrayList<Integer>();
         // Populate result;
         int m=a.size();//rows
         int n=a.get(0).size();//columns
         int k=0,l=0;//k for rows, l for columns

         while(k<m&&l<n){
            for(int i=l;i<n;i++)
                result.add(a.get(k).get(i));
            k++;
            for(int i=k;i<m;i++)
                result.add(a.get(i).get(n-1));
            n--;
            if(k<m){
                for(int i=n-1;i>=l;i--)
                    result.add(a.get(m-1).get(i));
                m--;
            }
            if(l<n){
                for(int i=m-1;i>=k;i--)
                    result.add(a.get(i).get(l));
                l++;
            }
         }
         
         return result;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int R,C;
        Strint[] rc = br.readLine().split(" ");
        R=Integer.parseInt(rc[0]);
        C=Integer.parseInt(rc[1]);

        for(int i=0;i<R;i++){
            ArrayList<Integer> list2 = new ArrayList<Integer>();
        String[] s = br.readLine().split(" ");
        for(int i=0;i<s.length;i++){
            a.add(Integer.parseInt(s[i]));
        }
    }
        int b=Integer.parseInt(br.readLine());
        System.out.println(rotateArray(list,b));
    }
}