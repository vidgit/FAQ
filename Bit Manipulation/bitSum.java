import java.util.*;

public class bitSum {
    public static int cntBits(ArrayList<Integer> A) {
        long n=A.size();
        long res=0;
        for(int i=0;i<31;i++){
            long cnt=0;
            //System.out.println((1<<i));
            for(int j=0;j<n;j++){
                System.out.println((A.get(j)&(1<<i)));
                //System.out.println("A[j]="+A.get(j));
                
                if(((A.get(j))&(1<<i))!=0)
                    cnt++;
            }
            //System.out.println(cnt);
            res+=(cnt*(n-cnt)*2)%1000000007;
            if(res>1000000007)
                res-=1000000007;
        }
        return (int)res;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(1);
        A.add(3);
        A.add(5);
        System.out.println(cntBits(A));
    }
}