import java.io.*;
import java.util.*;
public class NoOfDuplicates {
    // DO NOT MODIFY THE LIST
    public int findCount(final List<Integer> a, int b) {
        int n = a.size();
        int i = 0, j = n - 1;
        int start = -1, end = -1;
        while(i<j){
            int mid= (i+j)/2;
            if(a.get(mid)<b)
                i=mid+1;
            else j=mid;
        }
        if(a.get(i)!=b)
            return 0;
        start=i;
        j=n-1;
        while(i<j){
            int mid= (i+j)/2+1;
            if(a.get(mid)>b)
                j=mid-1;
            else i=mid;
        }
        end=j;
        return (end - start + 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().trim().split(" ");
        NoOfDuplicates obj=new NoOfDuplicates();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<s.length;i++){
            list.add(Integer.parseInt(s[i]));
        }
        //1 1 2 2 2 2 3 3 3 3 3 3 3 4 4 5 5 5 5 5 6 6 6 7 7 8 8 8 8 9 9 10 10 10
        
        System.out.println(obj.findCount(list,1));
    }
}