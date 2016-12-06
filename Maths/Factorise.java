import java.util.*;
public class Factorize {
    public static ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list.add(1);
        int root=(int)Math.sqrt(a);
        int index=1;
        for(int i=2;i<=root;i++){
            if(a%i==0){
                System.out.println(i);
                System.out.println(a/i);
                list.add(i);
                if((a/i)!=root)
                list2.add(0,a/i);
            }
        }
        for(int i:list2)
        list.add(i);
        if(a!=1)
        list.add(a);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(allFactors(38808));
    }
}
