import java.util.*;

public class Flip {
    public static ArrayList<Integer> flip(String A) {
        int[] a=new int[A.length()];
        for(int i=0;i<a.length;i++){
            if(A.charAt(i)=='0')
                a[i]=1;
            else
                a[i]=-1;
        }
        
        int max_sum=0, sum=0, start=Integer.MAX_VALUE, end=Integer.MAX_VALUE, l=0;
        
        for(int i=0;i<a.length;i++){
            if(sum+a[i]<0)
                {
                    sum=0;
                    l=i+1;
                }
            else 
            sum+=a[i];
            if(sum>max_sum){
                max_sum=sum;
                start=l;
                end=i;
            }
        }
        
        if(start==Integer.MAX_VALUE)
            return new ArrayList<Integer>();
        else{
            ArrayList<Integer> result=new ArrayList<Integer>();
            result.add(start);
            result.add(end);
            return result;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(flip("010"));
    }
}
