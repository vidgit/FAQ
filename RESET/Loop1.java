import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loop1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int readInt()throws IOException{
        return Integer.parseInt(br.readLine().trim());
    }

    public static void main(String[] args)throws IOException {
        int n = readInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}
