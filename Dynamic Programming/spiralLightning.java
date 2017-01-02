/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class spiralLightning {
    
    static long[] res=new long[10000001];
    static int mod=1000000009;
    public static void build(){
        res[0]=0;
        res[1]=1;
        res[2]=1+2+3+4;
        for(long i=3;i<10000001;i++){
            long x=(4l*(i*i)%mod)%mod;
            long y=(6l*(i-1l))%mod;
            res[(int)i]=(res[(int)(i-2)]+x-y)%mod;
            res[(int)i]=(mod+res[(int)i])%mod;
        }
    }
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        build();
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            System.out.println(res[n]);
        }
    }
}
