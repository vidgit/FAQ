import java.util.*;
public class findPermutation{

    public static ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int max=B,min=1;
        int l=A.length();
        //result.add((int)Math.ceil(B/2.0));
        for(int i=0;i<l;i++){
            if(A.charAt(i)=='D'){
                if(result.indexOf(max)==-1)
                    result.add(max--);
                else
                    result.add(--max);
            }
            else{
                if(result.indexOf(min)==-1)
                    result.add(min++);
                else
                    result.add(++min);
            }
            //System.out.println(result);
        }
        if(A.charAt(l-1)=='D')
            result.add(min);
        else
            result.add(max);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findPerm("DDDI",5));
    }
}