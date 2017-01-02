import java.util.*;
import java.io.*;

public class SearchMatrix{
    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int n=a.size();
        int m=a.get(0).size();
        for(int i=0;i<n;i++){
            if((a.get(i).get(0)<=b)&&(a.get(i).get(m-1)>=b))
                {
                    System.out.println("in");
                    int low=0,high=m-1;
                    ArrayList<Integer> l=a.get(i);
                    while(low<=high){
                        int mid=(low+high)/2;
                        if(l.get(mid)==b)
                            return 1;
                        else if(l.get(mid)<b)
                            low=mid+1;
                        else
                            high=mid-1;
                    }
                    return 0;
                }
        }
        return 0;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        a.add(new ArrayList<Integer>());
        a.get(0).add(1);
        System.out.println(searchMatrix(a,1));

    }
}