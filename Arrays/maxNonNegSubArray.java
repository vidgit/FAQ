/*


Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:

A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]

NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index

 */


import java.io.*;
import java.util.*;

public class maxNonNegSubArray {
    public static ArrayList<Integer> maxset(int[] a) {
        long curr_sum=0,max_sum=0;
        int curr_range1=0,curr_range2=0,max_range1=0,max_range2=0;
        int l=a.length;
        boolean neg=true;
        for(int i=0;i<l;i++){
            int ix=a[i];
            if(ix>=0){
                neg=false;
                curr_sum+=ix;
                
                if(curr_sum>max_sum){
                    max_sum=curr_sum;
                    max_range1=curr_range1;
                    max_range2=curr_range2;
                }
                if(curr_sum==max_sum){
                    if((max_range2-max_range1)<(curr_range2-curr_range1)){
                        max_range1=curr_range1;
                        max_range2=curr_range2;
                    }
                }
                curr_range2++;
            }
            else{
                curr_sum=0;
                curr_range1=i+1;
                curr_range2=i+1;
            }
        }
        ArrayList<Integer> list1= new ArrayList<Integer>();
        if(neg)
            return list1;
        for(int i=max_range1;i<=max_range2&&i<l;i++)
            list1.add(a[i]);
        return list1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().trim().split(" ");
        int[] a= new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }

        System.out.println(maxset(a));

    }
}