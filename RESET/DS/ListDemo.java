import java.io.IOException;
import java.util.ArrayList;

public class ListDemo{
    static ArrayList<Integer> list = new ArrayList<Integer>();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int readInt()throws IOException{
        return Integer.parseInt((br.readLine().trim()));
    }

    public static void readList()throws IOException{
        String[] s= br.readLine().trim().split(" ");
        for(String i:s){
            list.add(Integer.parseInt(i));
        }
    }

    public static int[] readArr()throws IOException{
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        return arr;
    }

    public static void main(String args[])throws IOException{
        int n=readInt();
        readList();
        n=readInt();
        while(n-->0){
            if(br.readLine().equals("Insert")){
                int[] command=readArr();
                list.add(command[0], command[1]);;
            }
            else{
                list.remove(readInt());
            }
        }

        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
