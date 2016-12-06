/*
    The following code is supposed to rotate the array A by B positions.

    So, for example,


    A : [1 2 3 4 5 6]
    B : 1

    The output :

    [2 3 4 5 6 1]
 */

import java.io.*;
import java.util.*;

public class Rotate {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        B%=A.size();
        int i;
        for (i = B; i < A.size(); i++) {
            ret.add(A.get(i));
        }
        for(i=0;i<B;i++){
            ret.add(A.get(i));
        }
        return ret;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<s.length;i++){
            list.add(Integer.parseInt(s[i]));
        }
        int b=Integer.parseInt(br.readLine());
        System.out.println(rotateArray(list,b));
    }
}