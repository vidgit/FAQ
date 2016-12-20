import java.util.*;
public class sumToK{
    public static void findPairs(int[] a,int k){
        Arrays.sort(a);

        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]+a[j]<k)
                i++;
            else if(a[i]+a[j]>k)
                j--;
            else{
                System.out.println(a[i]+","+a[j]);
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1, 1, 2, 3, 4};
        findPairs(a,4);
    }
}