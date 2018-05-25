
import java.io.*;
import java.math.BigInteger;

public class VeryBigSum{
    public static void main(String[] args)throws IOException {
        int n = IOV.readInt();
        BigInteger sum = BigInteger.valueOf(0);

        while(n-->0)
        {
            sum= sum.add(BigInteger.valueOf(readInt()));
        }

        System.out.println(sum);
    }
}
