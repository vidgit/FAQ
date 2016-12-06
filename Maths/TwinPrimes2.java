import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwinPrimes2{

    static HashSet<Long> primes=new HashSet<Long>();
    static BitSet primeBitSet;
    static int root;
    static void build(int end){
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
    static boolean isPrime(int n){
        
        
        /*if(n%2==0||n%3==0||n%5==0||n%7==0)
            return false;*/
        if(n<root&&primeBitSet.get(n))
            return true;
        int root=(int)Math.ceil(Math.sqrt(n));
        for(int i=3;i<=root;i+=2){
            if(primeBitSet.get(i))
                if(n%i==0)
                    return false;
        }

        //primes.add(n);
        return true;
    }

    static boolean isPrime2(int n){
        
        
        if(n%2==0)
            return false;
        int root=(int)Math.ceil(Math.sqrt(n));
        for(int i=3;i<=root;i+=2){
            //if(primeBitSet.get(i))
                if(n%i==0)
                    return false;
        }

        //primes.add(n);
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        //System.out.println("here");
        int count=0;
        if(n<=3)
            count++;
        root =(int)Math.ceil(Math.sqrt(m));
        build(root);
        while((n+1)%6!=0)
            n++;
        
        //System.out.println("here");
        //System.out.println("121 "+isPrime(121));
        for(int i=n;i<m-1;i+=6)
        {
            boolean x=isPrime(i);
            boolean y=isPrime(i+2);
            //if(isPrime(i)!=isPrime2(i))
              //  System.out.println(i+" : "+isPrime(i)+" "+isPrime2(i));

            //if(isPrime(i+2)!=isPrime2(i+2)){
               // System.out.println("i+2");
               // System.out.println(i+2+" : "+isPrime(i+2)+" "+isPrime2(i+2));
           // }
            if(x&&y){
                //System.out.println(i+","+(i+2));
                count++;
            }
        }
        System.out.println(count);
    }
}