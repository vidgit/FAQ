import java.util.*;
public class addOne{
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int n=a.size()-1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(a.get(n)!=9){
            a.set(n,a.get(n)+1);
            int i=0;
            while(a.get(i)==0)
                i++;
            for(;i<=n;i++){
                result.add(a.get(i));
            }
        }else{
            int carry=1;
            for(int i=n;i>=0;i--){
               if(a.get(i)+carry>9){
                   a.set(i,0);
                   carry=1;
               }
               else{
                   a.set(i,a.get(i)+1);
                   carry=0;
                   break;
               }
            }
            int i=0;
            if(carry==1){
                a.add(0,1);
            }
            while(a.get(i)==0)
                i++;
            for(;i<=a.size()-1;i++){
                result.add(a.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(9);
        l.add(9);
        l.add(9);
        l.add(9);
        l=plusOne(l);
        for(int i:l){
            System.out.println(i);
        }
    }
}
