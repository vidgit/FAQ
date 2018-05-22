import java.io.*;
import java.util.*;

public class DB2DArray{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ArrayList<Integer>> db = new ArrayList<ArrayList<Integer>>();

    public static int readInt()throws IOException{
        return Integer.parseInt((br.readLine().trim()));
    }

    public static ArrayList<Integer> readList()throws IOException{
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] s= br.readLine().trim().split(" ");
        for(String i:s){
            list.add(Integer.parseInt(i));
        }
        return list;
    }

    public static void printDB(){
        System.out.println("Printing DB");
        for(ArrayList<Integer> l : db){
            for(int i: l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static int[] readQuery()throws IOException{
        String[] s= br.readLine().trim().split(" ");
        int[] a = new int[s.length];
        a[0]=Integer.parseInt(s[0]);
        a[1]=Integer.parseInt(s[1]);
        return a;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("-------------------STARTING MODULE DB2DArray----------------");
        int n = readInt();
        
        while(n-->0){
            db.add(readList());
        }
        
        n=readInt();
        while(n-->0){
            int[] q= readQuery();
            if(db.size()<=q[0]) 
                System.out.println("ERROR");
            else if (db.get(q[0]).size()<=q[1])
                System.out.println("ERROR");
            else
                System.out.println(db.get(q[0]).get(q[1]));
        }
        printDB();
    }
}
