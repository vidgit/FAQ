import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CheckEOF {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=1;
        String str;
        while((str=br.readLine())!=null){
            System.out.println((i++)+" "+str);
        }
    }
}
