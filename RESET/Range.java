import java.util.*;
import java.io.*;
import java.math.BigInteger;



class Range{
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int readInt()throws IOException{
        return Integer.parseInt(br.readLine().trim());
    }

    public static double readDouble()throws IOException{
        return Double.parseDouble(br.readLine().trim());
    }

    public static int[] readArray()throws IOException{
        int[] arr;
        String[] srr = br.readLine().trim().split(" ");
        arr =  new int[srr.length];
        for(int i = 0; i<srr.length;i++){
            arr[i]=Integer.parseInt(srr[i]);
        }
        return arr;
    }
    
    public static void main(String []argh)throws IOException
    {
        int t = readInt();
        System.out.println(BigInteger.valueOf(Long.MAX_VALUE));
        while(t>0)
        {
            t--;
            String input=br.readLine().trim();
            BigInteger big = new BigInteger(input);
            if(big.compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0 && big.compareTo(BigInteger.valueOf(Long.MIN_VALUE))>=0)
            {
                long number = big.longValue();
                System.out.println(number + " can be fitted in:");
                if(number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE)
                    System.out.println("* Byte");
                if(number <= Short.MAX_VALUE && number >= Short.MIN_VALUE)
                    System.out.println("* Short");
                if(number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE)
                    System.out.println("* Integer");
                System.out.println("* Long");

            }
            else
            {
                System.out.println(input+" can't be fitted anywhere.");
            }
        }
        
    }
}
