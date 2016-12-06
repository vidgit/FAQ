/*
    Print whether a given natural number is prime or not.

    Example:
    1
    false

    2
    true

    121
    false

    56
    false

    563
    true
 */

import java.io.*;
public class IsPrime{
    public static boolean isPrime(long n){
        if(n==1)
            return false;
        if(n%2==0)
            return false;
        int root=(int)Math.sqrt(n)+1;
        for(int i=3;i<root;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isPrime(Long.parseLong(br.readLine().trim())));
    }
}