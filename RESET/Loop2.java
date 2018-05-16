//OBJECTIVE:
//PRINT THE FOLLOWING SEQUENCE
// (a+b) (a+2b) ... (a+2^(n-2)b) (a+2^(n-1)*b)

import java.util.*;
import java.io.*;

class Loop2{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int readInt()throws IOException{
        return Integer.parseInt(br.readLine().trim());
    }

    public static double readDouble()throws IOException{
        return Double.parseDouble(br.readLine().trim());
    }

    public static int[] readArray()throws IOException{
        int[] arr;
        String[] srr = br.readLine().trim().split(" ");
        arr =  new int[srr.length];
        for(int i = 0; i<srr.length;i++){
            arr[i]=Integer.parseInt(srr[i]);
        }
        return arr;
    }
    public static void main(String []args)throws IOException{
       int q = readInt(),i=0;
       while(i<q){
           i++;
           int[] arr = readArray();
           int a=arr[0],b=arr[1],n=arr[2],sum=a;
           for(int j=0;j<n;j++){
               sum+=(int)Math.pow(2,j)*b;
               System.out.print(sum+" ");
           }
           System.out.println();
       }
    }
}
