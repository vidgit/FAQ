/*
    Print a list of all the divisors of a natural number.

    Example:
    Input: 998
    Output: [1, 2, 499, 998]

 */
import java.io.*;
import java.util.*;
public class allDivisors {
    public static ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list.add(1);
        int root=(int)Math.sqrt(a);
        int index=1;
        for(int i=2;i<=root;i++){
            if(a%i==0){
                list.add(i);
                if((a/i)!=root)
                list2.add(0,a/i);
            }
        }
        for(int i:list2)
        list.add(i);
        if(a!=1)
        list.add(a);
        return list;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = allFactors(Integer.parseInt(br.readLine()));
        System.out.println(list);
    }
}