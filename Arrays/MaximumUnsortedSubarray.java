/*
Maximum Unsorted Subarray

You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
If A is already sorted, output -1.

Example :

Input 1:

A = [1, 3, 2, 4, 5]

Return: [1, 2]

Input 2:

A = [1, 2, 3, 4, 5]

Return: [-1]

In the above example(Input 1), if we sort the subarray A1, A2, then whole array A should get sorted.

 */

import java.util.*;

public class MaximumUnsortedSubarray {
     public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int l=A.size();
        int start = 0;
        int end=l-1;
        int maxstart=0;
        int maxend=0;
        boolean started=false;
        
        for(;start<l-1;start++){
            if(A.get(start)>A.get(start+1))
                break;
        }
        if(start==l-1)
        {
            result.add(-1);
            return result;
        }
       
        for(;end>1;end--){
            if(A.get(end)<A.get(end-1))
                break;
        }
        System.out.println(start);
        System.out.println(end);

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=start;i<=end;i++){
            if(min>A.get(i))
                min=A.get(i);
            if(max<A.get(i))
                max=A.get(i);
        }
        System.out.println(min);
        System.out.println(max);
        for(int i=0;i<start;i++){
            if(A.get(i)>min){
                System.out.println("min");
                System.out.println(A.get(i));
                System.out.println(min);
                start=i;
                break;
            }
        }
        for(int i=l-1;i>end;i--){
            if(A.get(i)<max){
                System.out.println("max");
                System.out.println(A.get(i));
                System.out.println(max);
                end=i;
                break;
            }
        }
        
        result.add(start);
        result.add(end);
        
        return result;
    }
    public static void main(String[] args) {
        int[] s={1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19};
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=0;i<s.length;i++)
            A.add(s[i]);
        System.out.println(subUnsort(A));
    }
}