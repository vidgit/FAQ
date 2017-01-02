/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class chooseJudge {
    
    int maxSum=0,sum=0;
    int[] a;
    
    public void calc(int index,int l){
        if(index>=l){
            if(sum>maxSum){
                
                maxSum=sum;
                System.out.println("Max:"+maxSum);
            }
            return;
        }
            
            sum+=a[index];
            System.out.println("val:"+a[index]);
            System.out.println("sum:"+sum);
            for(int i=index+2;i<l+2;i++){
                calc(index+2,l);    
            }
            sum-=a[index];
    }
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        chooseJudge o=new chooseJudge();
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String[] s=br.readLine().split(" ");
            o.a=new int[s.length];
            for(int i=0;i<s.length;i++){
                o.a[i]=Integer.parseInt(s[i]);
            }
            for(int i=0;i<s.length;i++)
                o.calc(i,o.a.length);
            System.out.println(o.maxSum);
            o.maxSum=0;

            System.out.println("---------------------------------------------------------");
        }
    }
}
