import java.io.*;
import java.util.*;
public class repeatAndMissing{
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        long sum=0,sq_sum=0;
        int n=A.size();
        for(int i=0;i<n;i++){
            int temp=A.get(i);
            sum+=temp;
            sum-=(i+1);
            sq_sum+=(temp*temp);
            sq_sum-=(i+1l)*(i+1l);
        }
        sq_sum/=sum;
        int rep = (int)(sq_sum+sum)/2;
        int miss = (int)(sq_sum-rep);
        res.add(rep);
        res.add(miss);
        
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<s.length;i++){
            list.add(Integer.parseInt(s[i]));
        }
        ArrayList<Integer> list1=repeatedNumber(list);
        System.out.println(list1);
    }
}