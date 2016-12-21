import java.util.*;
import java.io.*;
public class reverseWords{
    public static void reverse(char[] a){
        //reverse word
        int i=0,prev=0;
        while(i<a.length){
            if(a[i]==' ')
            {
                rev(a,prev,i-1);
                prev=i+1;
            }    
            i++;
        }
        rev(a,prev,a.length-1);
        rev(a,0,a.length-1);

    }

    public static void rev(char[] a,int start,int end){
        //int offset
        System.out.println(start+":"+end);
        for(int i=start,j=end;i<j;i++,j--){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int k=0;k<a.length;k++)
            System.out.print(a[k]);
        System.out.println();
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine(); 
        char[] a=s.toCharArray();
        //for(int i=0;i<a.length;i++)
        //    System.out.print(a[i]);
        System.out.println();
        reverse(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}