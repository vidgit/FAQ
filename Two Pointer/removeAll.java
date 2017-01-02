import java.util.*;
public class removeAll{   
    public static int removeElement(ArrayList<Integer> a, int b) {
        int one=0,two=0;
        for(int i=0;i<a.size();i++){
            int ix=a.get(i);
            if(ix!=b){
                if(i>one){
                    a.set(one,a.get(i));
                    a.set(i,b);
                    
                }
                one++;
            }
        }
        return one;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(4);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(3);
        System.out.println(removeElement(a,1));
        System.out.println(a);
    }
}