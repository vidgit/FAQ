/*
    

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.


 */

import java.io.*;
import java.util.*;

public class maxSubArray{

    public static int maxSubArrayFunc(int[] a){
        int sum=Integer.MIN_VALUE;
        int last=0;
        for(int i=0;i<a.length;i++){
            last+=a[i];
            
            sum=Math.max(sum,last);
            if(last<=0){
                last=0;
            }
        }
        return sum;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().trim().split(" ");
        int[] a= new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }

        System.out.println(maxSubArrayFunc(a));
    }
}