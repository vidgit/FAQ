/*
Find Duplicate in Array
Given a stream of n integers between 1 and n find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
Multiple Repeats are possible.
Input:
[3 4 1 4 1]

Output:
4
 */
import java.io.*;
import java.util.*;

public class DuplicatesNoXOR{
    
    public static int repeatedNumber(ArrayList<Integer> a){
        if(a.size()<=1)
            return -1;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(String i:s)
            list.add(Integer.parseInt(i));
        System.out.println(repeatedNumber(list));
    }
}