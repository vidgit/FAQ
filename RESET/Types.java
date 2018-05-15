import java.util.Scanner;
import java.io.*;

public class Types {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();
        
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
