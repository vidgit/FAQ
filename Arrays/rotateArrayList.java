import java.util.*;
public class rotateArrayList{

    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        int tmp;
        int n=a.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                tmp=a.get(i).get(j);
                System.out.println(tmp);
                System.out.println(a.get(j).get(i));
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,tmp);
            }
        }
        printList(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                tmp=a.get(i).get(j);
                System.out.println(tmp);
                System.out.println(a.get(i).get(n-1-j));
                a.get(i).set(j,a.get(i).get(n-1-j));
                a.get(i).set(n-j-1,tmp);
            }
        }
        printList(a);
    }
    static void printList(ArrayList<ArrayList<Integer>> a){
        for(ArrayList<Integer> i: a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        a.add(new ArrayList<Integer>());
        a.get(0).add(1);
        a.get(0).add(2);
        a.add(new ArrayList<Integer>());
        a.get(1).add(3);
        a.get(1).add(4);
        printList(a);
        rotate(a);
    }
}