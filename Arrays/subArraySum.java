import java.io.*;
import java.util.*;

public class subArraySum{
    static int[] createSum(int[] a){
        
        int[] b = new int[a.length];
        b[0]=Math.abs(a[0]);
        for(int i=1;i<a.length;i++){
            
            b[i]=b[i-1]+Math.abs(a[i]);
        }

        return b;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] a = new int[s.length];
        for(int i=0;i<s.length;i++)
            a[i]=Integer.parseInt(s[i]);
        int[] b=createSum(a);

        for(int i:b)
            System.out.print(i+" ");
    }
}