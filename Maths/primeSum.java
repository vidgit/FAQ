/*
Prime SumBookmark Suggest Edit
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class primeSum{

    public ArrayList<Integer> primesum(int a) {
        build(a);
        ArrayList<Integer> list= new ArrayList<Integer>();
        if(primeBitSet.get(2)&&primeBitSet.get(a-2))
        {
            list.add(2);   
            list.add(a-2);
        }
        else{
            for(int i=3;i<a-2;i+=2){
                if(primeBitSet.get(i)&&primeBitSet.get(a-i))
                    {
                        list.add(i);   
                        list.add(a-i);
                        break;
                    }
            }
        }
        return list;
    }
    BitSet primeBitSet;
    void build(int end){
        primeBitSet = new BitSet(end);
        primeBitSet.set(2, primeBitSet.size());

        // From index 2, run Sieve of Erathosthenes
        for (int j = 2; j < end; j++) {
            if (primeBitSet.get(j)) {
                    // This bit is set. That means this is prime. Set all multiples of 
                    // this bit as false
                for (int k = 2 * j; k < end; k += j) {
                    primeBitSet.set(k, false);
                }
            }
        }

        /*for(int i=1;i<end;i++){
            System.out.println(i+" : "+primeBitSet.get(i));
        }*/
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(primesum(Integer.parseInt(br.readLine())));
    }
}