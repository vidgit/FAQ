import java.io.*;

public class StaticBlock{
    static int B,H;
    static boolean flag=true; 
    static{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            B=Integer.parseInt(br.readLine().trim());
            H=Integer.parseInt(br.readLine().trim());
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
        if(B<=0 || H<=0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static void main(String[] args){
        if(flag){
            System.out.println(B*H);
        }
    }
    
   }
