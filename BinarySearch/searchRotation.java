import java.util.*;
public class searchRotation {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        
        int pivot=findMin(a);
        System.out.println(pivot);
        if(a.get(pivot)==b)
            return pivot;
        int low=pivot+1;
        int high=a.size()-1;
        
        int res=binSearch(a,low,high,b);
        System.out.println(res);
        if(res==-1){
            low=0;
            high=pivot-1;
            res=binSearch(a,low,high,b);
        }
        return res;
    }
    
    public int binSearch(final List<Integer> a,int low,int high, int b){
        while(low<=high){

            int mid=(low+high)/2;
            int ix=a.get(mid);
            if(ix==b)
                return mid;
            if(ix>b)
                high=mid-1;
            else
                low=mid+1;
            
        }
        return -1;
    }
    public int findMin(final List<Integer> a) {

        int low=0,high=a.size()-1,n=a.size()-1;
        while(low<high){
            if(a.get(low)<=a.get(high))
                return low;
            int mid=(low+high)/2;
            int prev=(n+mid-1)%n;
            int next=(mid+1)%n;

            if(a.get(mid)<=a.get(next)&&a.get(mid)<=a.get(prev))
                return mid;
            if(a.get(mid)<=a.get(high))
                high=mid-1;
            else if(a.get(mid)>=a.get(low))
                low=mid+1;
        }
        return low;
    
    }
    public static void main(String[] args) {
        int[] arr={101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i:arr){
            a.add(i);
        }
        System.out.println(new searchRotation().search(a,202));
    }
}