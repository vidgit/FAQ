import java.io.*;

import algo.IOV;

public class MinMaxSum{

    public static void main(String[] args)throws IOException {
        int[] arr=IOV.readArray();

        int min=Integer.MAX_VALUE;
        int max=0;
        
        long sum=0;

        for(int i : arr){
            sum+=i;
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;    
            }
        }
        System.out.printf("%d %d",sum-max,sum-min);
    }
}
