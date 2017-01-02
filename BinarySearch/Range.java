import java.util.*;
public class Range{
public static int findFirst(List<Integer> a,int b){
        int low=0,hi=a.size()-1;
        while(low<hi){
            int mid=(low+hi)/2;
            System.out.println(a.get(mid));
            if(a.get(mid)<b){
                low=mid+1;
            }
            else{
                hi=mid;
            }
        }
        if(a.get(low)!=b)
            return -1;
        return low;
    }
 
    
    public static int findLast(List<Integer> a,int b){
        System.out.println("Last");
        int low=0,hi=a.size()-1;
        while(low<hi){
            int mid=(low+hi)/2;
            int ix=a.get(mid);
            if((mid==hi&&ix==b)||(ix==b&&a.get(mid+1)>b))
                return mid;
            if(a.get(mid)<=b){
               low=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        if(a.get(hi)!=b)
            return -1;
        return hi;
    }
    public  static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(findFirst(a,b));
        list.add(findLast(a,b));
        return list;
    }
    public static void main(String[] args) {
        int[] a= {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i:a){
            arr.add(i);
        }
        System.out.println(searchRange(arr,10));
    }
}