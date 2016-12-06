import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwinPrimes {

     static boolean checkPrime(long n)
    {
        // Converting long to BigInteger
        BigInteger b = new BigInteger(String.valueOf(n));
 
        return b.isProbablePrime(1);
    }

    static long nextPrime(long n)
    {
        BigInteger b = new BigInteger(String.valueOf(n));
        return Long.parseLong(b.nextProbablePrime().toString());
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a= br.readLine().split(" ");
        long n= Long.parseLong(a[0]);
        long m= Long.parseLong(a[1]);
        if(n%2==0)
            n++;
        long count=0;
        boolean first =false ,last=true;
        /*for(long i=n;i<=m-2;i+=6)
            {   
                if(last){
                    boolean y=isPrime(i);
                    if(y){
                        last = isPrime(i+2);
                            if(last&&y)
                        {
                            count++;
                            
                        }
                    }
                    
                    
                    
                }
                else{
                    last=true;
                }
            }*/
        long i=nextPrime(n);
        long x=0;
        while(i<=m){
            x=nextPrime(i);
            //System.out.println(x);
            
            if(x-i==2){
                System.out.println(i+","+(i+2));
                count++;
            }
            i=x;
        }
        System.out.println(count);
    }
}