import java.util.*;
public class sumToKBetter{
    public static void findPairs(int[] a,int k){
        HashSet<Integer> seen = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            if(seen.contains(k-a[i]))
                System.out.println(a[i]+","+(k-a[i]));
            else
                seen.add(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] a={1, 1, 2, 3, 4};
        findPairs(a,4);
    }
}