import java.util.*;
public class median{
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
         ArrayList<Integer> merged=new ArrayList<Integer>();
        int i=0,j=0,n=a.size(),m=b.size();
        int t=0;
        boolean even=(n+m)%2==0;
        int count=0,half=(n+m)/2;
            
        while(i<n&&j<m){
            if(a.get(i)<b.get(j))
                {
                    merged.add(a.get(i));
                    i++;
                }
            else
                {
                    merged.add(b.get(j));
                        j++;
                }
            /*if(count==half){
                if(even)
                    {
                        if(a.get(i)<b.get(j))
                            {
                                return (merged.get(count)+a.get(i))/2.0;
                            }
                        else
                            {
                                return (merged.get(count)+b.get(j))/2.0;
                            }
                    }
                else
                    return (double)merged.get(count);
                    
            }
            count++;*/
        }
        while(i<n){
            merged.add(a.get(i));
            i++;
           /* if(count==half){
                if(even)
                {
                    return (merged.get(count)+a.get(i))/2.0;
                }
                return (double)merged.get(count);
            }
            count++;*/
            
        }
        while(j<m){
            merged.add(b.get(j));
            j++;
            /*if(count==half){
                if(even)
                {
                    return (merged.get(count)+b.get(j))/2.0;
                }
                return (double)merged.get(count);
            }
            count++;*/
        }
        System.out.println(merged);
        if(even){
            return (merged.get(half-1)+merged.get(half))/2.0;
        }
        return merged.get(half);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        int[] arr1={0, 23};
        for(int i:arr1){
            //System.out.print(i+" ");
            a.add(i);
        }
        //a.add(1);
        int[] arr2={};
        for(int i:arr2){
            //System.out.print(i+" ");
            b.add(i);
        }
        //a.add(3);
        //b.add(4);
        //b.add(5);
        //b.add(6);
        System.out.println(findMedianSortedArrays(a,b));
    }
}
