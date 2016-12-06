import java.io.*;
import java.util.*;

public class sieve2{
    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        BitSet primeBitSet = new BitSet(end);
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

        /*
        for (int i = start; i < end; ++i) {
            if (primeBitSet.get(i)) {
                System.out.println(i);
            }
        }*/
        for (int i = primeBitSet.nextSetBit(0); i <= end; i = primeBitSet.nextSetBit(i + 1)) {
            System.out.println(i);
            }
        System.out.println(primeBitSet.size());
    }
}