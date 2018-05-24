import java.io.*;
import java.util.*;

public class IOV{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int readInt()throws IOException{
        return Integer.parseInt(br.readLine().trim());
    }

    public static String readString()throws IOException{
        return br.readLine().trim();
    }

    public static int[] readArray()throws IOException{
        String[] strings = br.readLine().trim().split(" ");
        return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)throws IOException {
        System.out.println("---------------------Starting Main Method--------------------------");
        int n = readInt();
        String s = readString();
        int[] arr = readArray();
        System.out.println(n);
        System.out.println(s);
        System.out.println(arr);
    }
}
