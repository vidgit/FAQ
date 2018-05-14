import java.util.*;
import java.io.*;

public class InOut {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public int readInt()throws IOException{
        return Integer.parseInt(br.readLine().trim());         
    }
    
    public static void main(String[] args)throws IOException {
        Scanner scan = new Scanner(System.in);
        InOut s = new InOut();
        int a = s.readInt();
        int b = s.readInt();
        int c = s.readInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
