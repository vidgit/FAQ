/*
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4


 */

/*
    sum=1+2+3+4+...+n 
    sum1=sum-missing+repeat
    diff = sum1-sum=repeat-missing
    sq_sum= 1^2+2^2+3^2+...+n^2
    sq_sum1=sq_sum-missing^2+repeat^2
    sq_sum1-sq_sum=repeat^2-missing^2
    plus = sq_sum1-sq_sum/diff
    
 */
import java.io.*;
import java.util.*;

public class repeatedAndMissing{

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        Collections.sort(A);
        int n = A.size();
        int rep = -1;
        int miss = -1;
        long sum = A.get(0);
        
        for (int i = 1; i < n; i++) {
            if (A.get(i).intValue() == A.get(i - 1).intValue()) {
                rep = A.get(i);
            }
            sum += A.get(i);
        }
        
        miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);
        
        res.add(rep);
        res.add(miss);
        
        return res;
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<s.length;i++){
            list.add(Integer.parseInt(s[i]));
        }
        ArrayList<Integer> list1=repeatedNumber(list);
        System.out.println(list1);
    }
}